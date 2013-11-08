package SQLDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.IBS.DBConnector;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.DatabaseInterface;

public class UserTable implements DatabaseInterface<DTO> {
	Connection connector = null;

	public UserTable() {
		try {
			connector = DBConnector.getConnection();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void create(DTO dto) throws NoLoadedDataException {
		try {
			connector = DBConnector.getConnection();
			Statement stmt = connector.createStatement();
			String query = "Insert INTO USERS VALUES(" + dto.getUserID() + ",'"
					+ dto.getFirstName() + "','" + dto.getLastName() + "','"
					+ dto.getType() + "','" + dto.isGuest() + "')";

			ResultSet rs = stmt.executeQuery(query);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();

		}

	}

	@Override
	public DTO retrieve(int key) {
		PreparedStatement stmt;
		int id = 0;
		String firstname = null;
		String lastname = null;
		try {
			String query = "SELECT * FROM USERS WHERE ID = ?";
			stmt = connector.prepareStatement(query);

			stmt.setString(1, Integer.toString(key));
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				id = Integer.parseInt(rs.getString(1));
				firstname = rs.getString(2);
				lastname = (rs.getString(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		User u = new Patron(id, firstname, lastname);
		DTO dto = new DTO((Patron) u);
		return dto;

	}

	@Override
	public void update(int key, DTO dto) throws NoSuchRecordException {
		PreparedStatement stmt;
		try {
			String query = "Update Users Set Firstname= ?, " +
					"lastname= ?, Type= ?, ISGUEST= ? WHERE ID = ? ";
			stmt = connector.prepareStatement(query);


			stmt.setString(1, dto.getFirstName());
			stmt.setString(2, dto.getLastName());
			stmt.setString(3, Integer.toString(dto.getType()));
			stmt.setString(4, Integer.toString(dto.isGuest()));
			stmt.setString(5, Integer.toString(key));

			ResultSet rs = stmt.executeQuery();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void delete(int key) {
		PreparedStatement stmt;
		try {
			String query = "Delete FROM USERS WHERE ID = ?";
			stmt = connector.prepareStatement(query);

			stmt.setString(1, Integer.toString(key));
			ResultSet rs = stmt.executeQuery();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}

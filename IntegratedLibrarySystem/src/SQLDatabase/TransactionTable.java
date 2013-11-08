package SQLDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.IBS.DBConnector;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.rammem.DatabaseInterface;

public class TransactionTable implements DatabaseInterface<DTO> {
	Connection connector = null;

	public TransactionTable() {
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
			String query = "Insert INTO Transaction VALUES(" + dto.getTransID() + ",'"
					+ dto.getUserID() + "','" + dto.getISBN() +"')";

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
		int tid = 0;
		int id=0;
		String ISBN = null;
		try {
			String query = "SELECT * FROM Transaction WHERE TID = ?";
			stmt = connector.prepareStatement(query);

			stmt.setString(1, Integer.toString(key));
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				tid = Integer.parseInt(rs.getString(1));
				id = Integer.parseInt(rs.getString(2));
				ISBN = (rs.getString(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		Transaction trans = new Transaction(id, id, ISBN);
		DTO dto = new DTO(trans);
		return dto;

	}

	@Override
	public void update(int key, DTO dto) throws NoSuchRecordException {
		PreparedStatement stmt;
		try {
			String query = "Update Transaction Set Firstname= ? lastname= ? Type= ? ISGUEST= ? WHERE ID = ? ";
			stmt = connector.prepareStatement(query);

			stmt.setString(5, Integer.toString(key));
			stmt.setString(1, dto.getLastName());
		//	stmt.setString(2, dto.getType());
			stmt.setString(3, Integer.toString(key));
			stmt.setString(4, Integer.toString(key));
			ResultSet rs = stmt.executeQuery();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void delete(int key) {
		PreparedStatement stmt;
		try {
			String query = "Delete From Transaction WHERE TID = ?";
			stmt = connector.prepareStatement(query);

			stmt.setString(1, Integer.toString(key));
			ResultSet rs = stmt.executeQuery();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}

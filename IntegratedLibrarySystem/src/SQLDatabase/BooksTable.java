package SQLDatabase;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.rammem.DatabaseInterface;

public class BooksTable implements DatabaseInterface<DTO> {

	@Override
	public void create(DTO e) throws NoLoadedDataException {
		// TODO Auto-generated method stub

	}

	@Override
	public DTO retrieve(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int key, DTO e) throws NoSuchRecordException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int key) {
		// TODO Auto-generated method stub

	}

}

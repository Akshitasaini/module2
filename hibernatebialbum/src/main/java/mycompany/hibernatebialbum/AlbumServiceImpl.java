package mycompany.hibernatebialbum;

import java.sql.SQLException;
import java.util.List;

public class AlbumServiceImpl implements AlbumService {
	private AlbumDao dao;

	public AlbumServiceImpl(AlbumDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Album createAlbum(Album album) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createAlbum(album);
	}

	@Override
	public Album getMyImage(int id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getMyImage(id);
	}

	@Override
	public int deleteAlbum(int id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deleteAlbum(id);
	}

	@Override
	public Album deleteMyImage(int id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deleteMyImage(id);
	}
	

}

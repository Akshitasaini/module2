package mycompany.hibernatebialbum;

import java.sql.SQLException;
import java.util.List;



public interface AlbumDao {
	public Album createAlbum(Album album) throws SQLException;
	public Album getMyImage(int id) throws SQLException;
	public int deleteAlbum(int id) throws SQLException;
	public Album deleteMyImage(int id) throws SQLException;
}

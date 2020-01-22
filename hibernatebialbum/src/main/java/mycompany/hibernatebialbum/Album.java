package mycompany.hibernatebialbum;

import java.awt.Image;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="table")
public class Album {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
@Column(name="album_name")
private String albumName;
@Column(name = "creation_date")
private LocalDate creationDate;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "my_image")
private MyImage myImage;
public Album() {
	
}
public Album( String albumName, LocalDate creationDate) {
	super();

	this.albumName = albumName;
	this.creationDate = creationDate;
	 
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAlbumName() {
	return albumName;
}
public void setAlbumName(String albumName) {
	this.albumName = albumName;
}
public LocalDate getCreationDate() {
	return creationDate;
}
public void setCreationDate(LocalDate creationDate) {
	this.creationDate = creationDate;

}
public MyImage getMyImage() {
	return myImage;
}
public void setMyImage(MyImage myImage) {
	this.myImage = myImage;
}
@Override
public String toString() {
	return "Album [id=" + id + ", albumName=" + albumName + ", creationDate=" + creationDate + ", myImage=" + myImage
			+ "]";
}

}

package mycompany.hibernatebialbum;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "my_image")
public class MyImage {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name = "image_id")
        private int imageId;
        @Column(name = "image_url")
        private String imageUrl;
        @OneToOne(mappedBy = "myImage", cascade = CascadeType.ALL)
        private Album album;
    	
    	public MyImage () {
    		
    	}

		public MyImage( String imageUrl) {
			super();
			
			this.imageUrl = imageUrl;
			
		}

		public int getImageId() {
			return imageId;
		}

		public void setImageId(int imageId) {
			this.imageId = imageId;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Album getAlbum() {
			return album;
		}

		public void setAlbum(Album album) {
			this.album = album;
		}

		@Override
		public String toString() {
			return "MyImage [imageId=" + imageId + ", imageUrl=" + imageUrl + ", album=" + album + "]";
		}
    	

}

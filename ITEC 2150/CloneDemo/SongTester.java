package CloneDemo;

public class SongTester {
	public static void main(String[] args) {

		Song firstSong = new Song();
		try {

			Song leadingSong = (Song) firstSong.clone();
			System.out.println(firstSong.getTitle().equals(leadingSong.getTitle()));
			System.out.println(firstSong.getArtist().getName().equals(leadingSong.getArtist().getName()));

		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}

	}
}

class Song implements Cloneable {
	String title;
	Artist artist;
	float length;
	int year;

	public Song() {
		this("Null", new Artist("Null"), 2.5f, 2020);
	}

	public Song(String title, Artist artist, float length, int year) {
		this.title = title;
		this.artist = artist;
		this.length = length;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Song song = (Song) super.clone();
		song.artist = (Artist) (artist.clone());
		return song;
	}
}

class Artist implements Cloneable {
	String name;

	public Artist(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Artist{" + "name='" + name + '\'' + '}';
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
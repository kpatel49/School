import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.scene.Stage;
import javafx.scene.control.ListView;

public class CourseList extends Application{
	
	
	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		Stage window = primaryStage;
		window.setTitle("Ciurse Library");
		
		ListView<Object> listView = new ListView<>();
		listView.getItams().add(ReadBinary.read("course.bin"));
		listView.getSelectionModel();
		
//		VBox layout = new VBox(10);
//		layout.setPadding(new Insets(20, 20, 20, 20));
//		layout.
		
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
	}

}

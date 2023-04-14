package wang.zhichuang.fxcompose;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * @author zhichuang
 * @date 2023/4/12 0012
 **/
public class ComponentActivity extends ComponentApplication{
  double defaultWidth = 300;
  double defaultHeight = 250;

  public void setContent(Node node){
    var root = new VBox();
    root.getChildren().add(node);
    var scene = new Scene(root, defaultWidth, defaultHeight);
    primaryStage.setScene(scene);
    this.primaryStage.show();
  }

  public Text Text(String text){
    return new Text(text);
  }
}
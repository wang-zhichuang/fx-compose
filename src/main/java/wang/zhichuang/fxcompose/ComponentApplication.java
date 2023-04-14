package wang.zhichuang.fxcompose;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author zhichuang
 * @date 2023/4/14 0014
 **/
public class ComponentApplication extends Application {
  Stage primaryStage;
  @Override
  public void start(Stage primaryStage) {
    this.primaryStage = primaryStage;
    onCreate();
  }

  protected void onCreate() {
  }
}
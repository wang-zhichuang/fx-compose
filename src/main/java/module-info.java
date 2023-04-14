module wang.zhichuang.fxcompose {
  requires javafx.controls;
  requires javafx.fxml;


  opens wang.zhichuang.fxcompose to javafx.fxml;
  exports wang.zhichuang.fxcompose;
}
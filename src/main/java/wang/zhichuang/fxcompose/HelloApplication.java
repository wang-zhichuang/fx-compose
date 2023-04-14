package wang.zhichuang.fxcompose;


public class HelloApplication extends ComponentActivity {
  @Override
  public void onCreate() {
    super.onCreate();
    setContent(
            Text("Hello World!~")
    );
  }
}


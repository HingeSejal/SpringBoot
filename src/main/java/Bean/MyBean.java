package Bean;

public class MyBean {
    private String message;

    public MyBean(String message) {
        this.message = message;
    }

    public void showMessage(){
        System.out.println("Message: " + message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}

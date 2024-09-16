import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ClientWindow extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JTextArea log = new JTextArea();

    private final JPanel panelTop = new JPanel(new GridLayout(2, 3));
    private final JTextField tfIPAddress = new JTextField("127.0.0.1");
    private final JTextField tfPort = new JTextField("8189");
    private final JTextField tfLogin = new JTextField("slava_semenov");
    private final JPasswordField tfPassword = new JPasswordField("123456");
    private final JButton btnLogin = new JButton("Войти");

    private final JPanel panelBottom = new JPanel(new BorderLayout());
    private final JTextField tfMessage = new JTextField();
    private final JButton btnSend = new JButton("Отправить");

    ClientWindow() {
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setSize(WIDTH, HEIGHT);
       setTitle("ChatClient");

       panelTop.add(tfIPAddress);
       panelTop.add(tfPort);
       panelTop.add(tfLogin);
       panelTop.add(tfPassword);
       panelTop.add(btnLogin);
       add(panelTop, BorderLayout.NORTH);

       panelBottom.add(tfMessage, BorderLayout.CENTER);
       panelBottom.add(btnSend, BorderLayout.EAST);
       add(panelBottom, BorderLayout.SOUTH);

       log.setEditable(false);
       JScrollPane scrollLog = new JScrollPane(log);
       add(scrollLog);

       setVisible(true);

    }


    public static void main(String[] args) {
        new ClientWindow();
    }
}

package questionario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuSelecaoMateria {
    JPanel painelMateria = new JPanel();
    JFrame Frame = new JFrame();
    PerguntasMat perguntasMat = new PerguntasMat();
    PerguntasPort perguntasPort = new PerguntasPort();;
    JLabel notaMat = new JLabel("");
    JLabel notaPort = new JLabel("");
    JButton btnMatematica = new JButton("Matemática");
    JButton btnPortugues = new JButton("Português");
    public boolean btnMatematicaEnabled = true;
    public String notaMatText = "";

    ProjetoPrincipal proj = new ProjetoPrincipal();

    //FUNÇÃO QUE IMPEDE QUE A AÇÃO DO BOTÃO btnMatematica EXECUTE DUAS VEZES
    /*public void finalizarActionMat() {
        iMat = 3;
    }

    public void finalizarActionPort() {
        iPort = 3;
    }*/

    public void selecaoMateria() {

        painelMateria.setLayout(new BoxLayout(painelMateria, BoxLayout.Y_AXIS));
        painelMateria.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Titulo:
        JLabel label_titulo = new JLabel("Qual prova deseja fazer?\n ");
        label_titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        label_titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        painelMateria.add(label_titulo);

        // Botão para Matemática:
        btnMatematica.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnMatematica.setMaximumSize(new Dimension(120, 40));
        painelMateria.add(btnMatematica);

        //Configurando a exibição da nota de Matematica
        notaMat.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelMateria.add(notaMat);

        painelMateria.add(Box.createRigidArea(new Dimension(0, 5)));

        //Botão para Português.


        btnPortugues.setMaximumSize(new Dimension(120, 40)); // Alinha o botão no centro horizontalmente
        btnPortugues.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelMateria.add(btnPortugues);

        notaPort.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelMateria.add(notaPort);

        painelMateria.add(Box.createRigidArea(new Dimension(0, 5)));

        //Botão para história:
        JButton btnHistoria = new JButton("História");
        btnHistoria.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha o botão no centro horizontalmente
        btnHistoria.setMaximumSize(new Dimension(120, 40));
        painelMateria.add(btnHistoria);

        painelMateria.add(Box.createRigidArea(new Dimension(0, 5)));

        //Botão para Ciências
        JButton btnCiencias = new JButton("Ciências");
        btnCiencias.setAlignmentX(Component.CENTER_ALIGNMENT);// Alinha o botão no centro horizontalmente
        btnCiencias.setMaximumSize(new Dimension(120, 40));
        painelMateria.add(btnCiencias);

        //Criando a ação para os botões e utilizando o "i" para eles só poderem ser executados uma vez

            btnMatematica.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Frame.setVisible(false);
                    perguntasMat.exibirPerguntas();


                }
            });


            btnPortugues.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Frame.setVisible(false);
                    perguntasPort.exibirPerguntas();
                }
            });



        Font TituloFont = new Font("Arial", Font.BOLD, 15);
        label_titulo.setFont(TituloFont);


        Font fonteCheckBox = new Font("Arial", Font.PLAIN, 15);
        btnMatematica.setFont(fonteCheckBox);
        btnPortugues.setFont(fonteCheckBox);
        btnHistoria.setFont(fonteCheckBox);
        btnCiencias.setFont(fonteCheckBox);

    }

    public void exibirMenu() {
        Frame.setSize(320, 320);
        Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dimensaoTela.width - Frame.getSize().width) / 2;
        int y = (dimensaoTela.height - Frame.getSize().height) / 2;
        Frame.setLocation(x, y);
        Frame.setVisible(true);
        Frame.add(painelMateria);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selecaoMateria();

        btnMatematica.setEnabled(btnMatematicaEnabled);
        notaMat.setText(notaMatText);
    }
}
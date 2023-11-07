import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Hell  extends JFrame {
    private int MilLanScore = 0;
    private int MadridScore = 0;
    JLabel ResultsBoard = new JLabel("Result: 0 X 0");
    JLabel WinnerBoard = new JLabel("Winner: DRAW");
    JLabel LastScoreBoard = new JLabel("Last Scorer: N/A");
    JButton MillanButton = new JButton("AC Milan");
    JButton MadridButton = new JButton("Real Madrid");


    void UpdateInfo(String LastWinner){
        ResultsBoard.setText(MadridScore + " : " + MilLanScore);
        LastScoreBoard.setText("Last scorer: " + LastWinner);
        if(MilLanScore>MadridScore){
            WinnerBoard.setText("Winner: AC Millan");
        }
        else if(MilLanScore<MadridScore) {
            WinnerBoard.setText("Winner: Real Madrid");
        }
    }

    public Hell(){
        super("Match results table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,250);
        setLayout(new GridLayout(3, 1));

        add(MillanButton);
        add(MadridButton);
        add(ResultsBoard);
        add(LastScoreBoard);
        add(WinnerBoard);

        MillanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MilLanScore++;
                UpdateInfo("AC Millan");
            }
        });

        MadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MadridScore++;
                UpdateInfo("Real Madrid");
            }
        });
    }
    public static void main(String[]args){
        new Hell().setVisible(true);
    }
}

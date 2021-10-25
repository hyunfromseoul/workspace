package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		// 꺼졌을때 FRAME도 같이 끄게 함
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // 창이 보이게 함
	}
}

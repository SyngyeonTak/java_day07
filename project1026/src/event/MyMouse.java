package event;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
class MyMouse implements MouseListener{
	public void mouseClicked(MouseEvent e){
		System.out.println("Clicked Called");
	}

	public void mouseEntered(MouseEvent e){
		//System.out.println("Entered Called");	
	}

	public void mouseExited(MouseEvent e){
		//System.out.println("Exited Called");	
	}

	public void mousePressed(MouseEvent e){
		//System.out.println("Pressed Called");	
	}

	public void mouseReleased(MouseEvent e){
		//System.out.println("Released Called");	
	}

}

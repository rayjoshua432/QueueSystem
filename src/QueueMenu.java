import javax.swing.*;

public class QueueMenu {
	 public static void MainMenu() {
		Queue q = new Queue();
			
		String menu[] = {"Enqueue", "Dequeue", "Exit"};
		String choice = "", hold = "";
			
		do {
			hold = "Empty\t: " + q.isEmpty() + "\tFull\t: " + q.isFull() + "\n" +
					"Capacity\t: " + q.getCapacity() + "\tCurrent Size\t: " + q.getCurrentSize() + "\n" +
					"Peek\t:" + q.peek() + "\tLast\t:" + q.last() + "\n" +
					"Elements\t: " + q.display() + "\nSelect:";
					
				
			choice = JOptionPane.showInputDialog(null, new JTextArea(hold), "Menu", -1, null, menu,menu[0]).toString();
				
			switch(choice) {
				case "Enqueue":
					if (q.isFull()) {
						JOptionPane.showMessageDialog(null, "Queue is full!\nYou cannot add more elements.", "Enqueue Elements", 0);
					} else {
						int element = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the element: ", "Enqueue Elements", -1));
						q.enqueue(element);
					}
					break;
				case "Dequeue":
					if (q.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Queue is empty!\n You cannot remove elements.", "Dequeue Elements", 0);
					} else {
						JOptionPane.showMessageDialog(null, "'" + q.frontValue() + "' has been removed from the Queue!", "Dequeue Elements", 1);
						q.dequeue();
					}
					break;
				}
		} while(!choice.equals("Exit"));
	}
	public static void main(String[] args) {
		MainMenu();
	}
}

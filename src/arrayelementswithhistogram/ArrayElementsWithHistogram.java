
package arrayelementswithhistogram;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class ArrayElementsWithHistogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String output="Element\tValue\tHistogram";
        int array[]={5,12,4,10,20,2,8,3};
        for(int i=0;i<array.length;i++){
            
            output+= "\n"+i+"\t"+array[i];
        
        
            for(int freq=0; freq<=array[i]; freq++){
            
                output+="\t*";
            }
        }
        
        JTextArea textArea= new JTextArea();
        
        textArea.setText(output);
        System.out.println("Hello");
        JOptionPane.showMessageDialog(null, textArea, "Histogram printing program", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    
    }
}

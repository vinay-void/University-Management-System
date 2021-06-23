package university.management.system;



import java.awt.*;
import javax.swing.*;

public class Main{
    public static void main(String s[]){
        Frame f = new Frame(); 
        f.setVisible(true); 
        int i;
        int x=1;
        for(i=2;i<=600;i+=4,x+=1){
            /*sets the location of frame*/
            f.setLocation(300,100);
            
            f.setSize(i+3*x,i+x/2);
            
            try{
                Thread.sleep(10);
            }catch(Exception e) { }
        }
    }
}
class Frame extends JFrame implements Runnable{
    
    /*java doesn't support Multiple Inheritence, I used Multi Thread concept to extend
            2  java classes*/
    
    Thread t1;
    Frame(){
        //I used super() to give heading to my Frame
        super("University");
        setLayout(new FlowLayout());
        //ClassLoader to load Image in Frame
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/first.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1920, 800,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        //I used add()to add image      
        add(m1);
        t1 = new Thread(this);
        t1.start();
    }
        public void run(){
            try{
            Thread.sleep(9000);
            this.setVisible(false);
            Login f1 = new Login();
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
}
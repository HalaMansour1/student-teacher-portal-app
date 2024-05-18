/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
/**
 *
 * @author halamansour
 */
public class MyFunc {
// this part of the codee is used to save the image as a blob into the database and recieves parameters from the method ResizePic() 
public ImageIcon resizePic(String picPath, byte[] BLOBpic, int wdth,int hgt ) {
ImageIcon myImg;
if (picPath!=null){
  myImg = new ImageIcon(picPath);
}
else{
  myImg = new ImageIcon(BLOBpic);
}
Image img = myImg.getImage().getScaledInstance( wdth ,hgt , Image.SCALE_SMOOTH);
  ImageIcon myPicture = new ImageIcon(img)  ;
return myPicture ;

}

}



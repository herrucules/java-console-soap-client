/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleapp;

import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author herrucules
 */
public class ConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.print("Masukkan pilihan [1=encode,2=decode,0=exit]: ");
            pilihan = in.nextInt();
            if (pilihan == 0) break;
            
            try {
                System.out.print("Masukkan angka: ");
                int input = in.nextInt();                
                
                if (pilihan == 1) {
                    callService(input+"", "encode");
                } else {
                    callService(input+"", "decode");
                }                    
                
            } catch (Exception e) {
                System.out.println("hanya angka 0-9");
            }                       
            
            
            
        } while (true);
    }
    
    public static void callService(String in, String mode) {
        
        if (mode == "encode") {
System.out.println(in);
            try { // This code block invokes the SoaPort:simpleHashEncode operation on web service
                consoleapp.Soa soa = new consoleapp.Soa_Impl();
                consoleapp.SoaPortType _soaPort = soa.getSoaPort();
                System.out.println("Encoded string = "+ _soaPort.simpleHashEncode(in));
            } catch (javax.xml.rpc.ServiceException ex) {
                java.util.logging.Logger.getLogger(consoleapp.Soa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (java.rmi.RemoteException ex) {
                java.util.logging.Logger.getLogger(consoleapp.Soa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(consoleapp.Soa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
        else {
            
            try { // This code block invokes the SoaPort:simpleHashDecode operation on web service
                consoleapp.Soa soa = new consoleapp.Soa_Impl();
                consoleapp.SoaPortType _soaPort = soa.getSoaPort();
                System.out.println("Decoded string = "+ _soaPort.simpleHashDecode(in));
            } catch (javax.xml.rpc.ServiceException ex) {
                java.util.logging.Logger.getLogger(consoleapp.Soa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (java.rmi.RemoteException ex) {
                java.util.logging.Logger.getLogger(consoleapp.Soa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(consoleapp.Soa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
    }
    
}

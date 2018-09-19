import java.io.*;
class grocers
{
    BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in)) ;
    int x = 0 ;
    double bill = 0 ; String in[] = new String[100] ;
    double qn[]  = new double[100] ; double rate[] = new double[100] ; double amt[] = new double[100] ;
    public void main() throws IOException
    {
        int fu ;
        cp4:
        do
        {
            System.out.print("\u000c");
            System.out.println("\t\t\tWELCOME TO GROCERS APP");
            System.out.println("\t\t\tWe get it. You eat it. ");
            System.out.println("\nEnter : ");
            System.out.println("1 Place Order ");
            System.out.println("2 View your Shopping Cart");
            System.out.println("3 Terms and Conditions");
            System.out.println("4 Complains and Feedback");
            System.out.println("5 Contact Us");
            System.out.println("6 End");
            int c1 = Integer.parseInt(stdin.readLine());
            fu = 0 ; int f = 0 ;
            switch(c1)
            {
                case 1 : 
                cp3 :
                do
                { System.out.println("\u000cEnter 1 for fruits ; 2 for vegetables ; 3 for Main Menu ; 5 to view your Order.");
                    int c2 = Integer.parseInt(stdin.readLine()); 
                    switch(c2)
                    {
                        case 1 : fruit() ;  break ;
                        case 2 : veg() ; break ;
                        case 3 : continue cp4 ;
                        case 5 : System.out.print("\u000c");
                        for ( int j = 0 ; j < x ; j++ )
                        {
                            bill = bill + amt[j] ;
                        }
                        delay() ;
                        display() ; f = 1 ; fu = 1 ;
                        System.out.println("\nTotal Current Bill : Rs. "+bill);
                        break ;
                        default : System.out.println("Error in Input. Try Again. "); continue cp3 ;
                    } 
                } while ( f == 0 ) ;
                break ;
                
                case 2 :
                if( qn[0] == 0 )
                {
                    System.out.println("\u000cYour Shopping cart is empty. ");
                }
                else
                {
                    System.out.print("\u000c");
                    for ( int j = 0 ; j < x ; j++ )
                    {
                        bill = bill + amt[j] ;
                    }
                    delay() ;
                    display() ;
                    System.out.println("\nTotal Current Bill : Rs. "+bill);
                }
                fu = 1 ;
                break ;

                case 3 :
                terms() ; break ;

                case 4 :
                complain() ;
                break ;

                case 5 :
                contact() ;
                break ;
                
                case 6:
                System.out.println("Thank you!");     
                fu=0;
                break;
                
                default : continue cp4 ;
            }
            
        } while ( fu != 0 ) ;
        
        /*int pc = 1 ;
        pcp :
        do
        {
            System.out.println("\u000cChoose Payment Method : ");
            System.out.println("\n1. Credit Card");
            System.out.println("2. Debit Card");
            System.out.println("3. COD ( Cash on Delivery ) ");
            int pay = Integer.parseInt(stdin.readLine());
            String cardt , cardno , name ; int mm , yy , cvv , ipin ; 

            switch(pay)
            {case 1 :

                System.out.println("\u000cEnter 1 for Master Card ; 2 for VISA Card");
                int p1 = Integer.parseInt(stdin.readLine());

                switch(p1)
                {
                    case 1 :
                    cardt = "Master Card" ;
                    System.out.println("\u000cEnter : ");
                    System.out.print("Card Number : ");
                    cardno = stdin.readLine() ;
                    if(cardno.length() != 16)
                    {
                        System.out.println("Wrong Input. Retry.");
                        continue pcp ;
                    }
                    System.out.println("Expiry Date : ");
                    System.out.print( " MM : ") ;
                    mm = Integer.parseInt(stdin.readLine());
                    if( mm < 01 || mm > 12 )
                    {
                        System.out.println("Wrong Input. Retry.");
                        continue pcp ;
                    }
                    System.out.print("\tYYYY : ");
                    yy = Integer.parseInt(stdin.readLine());
                    if ( yy < 2015 )
                    {
                        System.out.println("Invalid Card. Try again.");
                        continue pcp ;
                    }
                    System.out.print("\nCVV : ") ;
                    cvv = Integer.parseInt(stdin.readLine());
                    System.out.print("\nName as on Card");
                    name = stdin.readLine() ;
                    System.out.println("Your iPIN : ");
                    ipin = Integer.parseInt(stdin.readLine());
                    break ;

                    case 2 :
                    cardt = "VISA card";
                    System.out.println("\u000cEnter : ");
                    System.out.print("Card Number : ");
                    cardno = stdin.readLine() ;
                    if(cardno.length() != 16)
                    {
                        System.out.println("Wrong Input. Retry.");
                        continue pcp ;
                    }
                    System.out.println("Expiry Date : ");
                    System.out.print( " MM : ") ;
                    mm = Integer.parseInt(stdin.readLine());
                    if( mm < 01 || mm > 12 )
                    {
                        System.out.println("Wrong Input. Retry.");
                        continue pcp ;
                    }
                    System.out.print("\tYYYY : ");
                    yy = Integer.parseInt(stdin.readLine());
                    if ( yy < 2015 )
                    {
                        System.out.println("Invalid Card. Try again.");
                        continue pcp ;
                    }
                    System.out.print("\nCVV : ") ;
                    cvv = Integer.parseInt(stdin.readLine());
                    System.out.print("\nName as on Card");
                    name = stdin.readLine() ;
                    System.out.println("Your iPIN : ");
                    ipin = Integer.parseInt(stdin.readLine());
                    break ;

                    default : pc = 0 ; continue pcp ;
                }

            }
            break ;
        } while ( pc == 0 ); */
            
    }

    public void fruit() throws IOException
    {
        int fu = 0 ;
        cp2 :
        do
        {
            System.out.println("1. Apple @ Rs. 90/kg ");
            System.out.println("2. Orange @ Rs. 70/kg ");
            System.out.println("3. Banana @ Rs. 40/kg");
            System.out.println("4. Guava @ Rs. 120/kg");
            System.out.println("5. Papaya @ Rs. 30/kg");
            System.out.println("Other fruits are Out of Stock ");
            System.out.println("Enter the No. for respective fruits ");
            int c3 = Integer.parseInt(stdin.readLine());
            x++ ;
            System.out.println("Enter quantity (kg) ");
            double q = Double.parseDouble(stdin.readLine());
            qn[x-1] =  q ;
            System.out.print("\u000c");
            switch(c3)
            {
                case 1 : amt[x-1] = q*90 ; in[x-1] = "Apple" ;
                rate[x-1] = 90 ; break ;
                case 2 : amt[x-1] = q*70 ; in[x-1] = "Orange" ;
                rate[x-1] = 70 ; break ;
                case 3 : amt[x-1] = q*40 ; in[x-1] = "Banana" ;
                rate[x-1] = 40 ; break ;
                case 4 : amt[x-1] = q*120 ; in[x-1] = "Guava" ;
                rate[x-1] = 120 ; break ;
                case 5 : amt[x-1] = q*30 ; in[x-1] = "Papaya" ;
                rate[x-1] = 30 ; break ;
                default : System.out.print("\u000c");
                System.out.println("Error in Input - Try Again");
                System.out.println("\n") ; continue cp2 ;
            }
            fu = 1 ;
        } while ( fu == 0 ) ;
    }

    public void veg() throws IOException
    {
        int fu = 0 ;
        cp1 :
        do
        {
            System.out.println("1. Potato @ Rs. 20/kg ");
            System.out.println("2. Onions @ Rs. 50/kg ");
            System.out.println("3. Tomato @ Rs. 20/kg");
            System.out.println("4. Carrot @ Rs. 40/kg");
            System.out.println("5. Cabbage @ Rs. 30/kg");
            System.out.println("6. Beans @ Rs. 80/kg");
            System.out.println("Other Vegetables are Out of Stock ");
            System.out.println("Enter the No. for respective vegetables ");
            int c4 = Integer.parseInt(stdin.readLine());
            x++ ;
            System.out.println("Enter quantity (kg) ");
            double q2 = Double.parseDouble(stdin.readLine());
            qn[x-1] = q2 ;
            System.out.print("\u000c");
            switch(c4)
            {
                case 1 : amt[x-1] = q2*20 ; in[x-1] = "Potato" ;
                rate[x-1] = 20 ; break ;
                case 2 : amt[x-1] = q2*50 ; in[x-1] = "Onions" ;
                rate[x-1] = 50 ; break ;
                case 3 : amt[x-1] = q2*20 ; in[x-1] = "Tomato" ;
                rate[x-1] = 20 ; break ;
                case 4 : amt[x-1] = q2*40 ; in[x-1] = "Carrot" ;
                rate[x-1] = 40 ; break ;
                case 5 : amt[x-1] = q2*30 ; in[x-1] = "Cabbage" ;
                rate[x-1] = 30 ; break ;
                case 6 : amt[x-1] = q2*80 ; in[x-1] = "Beans" ;
                rate[x-1] = 80 ; break ;
                default : System.out.print("\u000c");
                System.out.println("Error in Input - enter only Numbers");
                System.out.println("\n"); continue cp1 ;
            }
            fu = 1 ;
        } while ( fu == 0 ) ;
    }

    public void terms()
    {
        System.out.println("\u000cThe use of this website is subject to the following terms of use:\n");
        System.out.println("1.The content of the pages of this website is for your general information and use only. It is subject to change without notice.");
        System.out.println("2.This website uses cookies to monitor browsing preferences.");
        System.out.println("3.Your use of any information or materials on this website is entirely at your own risk, for which we shall not be liable.");
        System.out.println("4.All trade marks reproduced in this website which are not the property of, or licensed to, the operator are acknowledged on the website.");
        System.out.println("5.Unauthorised use of this website may give rise to a claim for damages and/or be a criminal offence.");
        System.out.println("6.From time to time this website may also include links to other websites. These links are provided for your convenience to provide further information.");
    }

    public void display()
    {
        System.out.println("\u000c\t\tYour Order Summary\n");
        System.out.println("Sr.No.\tItem Name\tQty\tRate\tAmount");
        for ( int i = 0 ; i < x ; i++ ) 
        {
            System.out.println((1+i)+"\t"+in[i]+"\t\t"+qn[i]+"\t"+rate[i]+"\t"+amt[i]);
        } 
    }

    public void complain() throws IOException
    {
        int cp = 0 ;
        comp :
        do
        {
            System.out.println("Enter 1 for Complain ; 2 for Feedback :");
            int c = Integer.parseInt(stdin.readLine());
            switch(c)
            {
                case 1 : 
                System.out.println("Enter Your Complain : ");
                String complains = stdin.readLine() ;
                System.out.println("\u000cWe are in receipt of your complaint which is receiving our attention.\nWe shall revert back to you soon.");
                System.out.println("\nEnter 0 to review your Complaint"); cp = 1 ;
                int c2 = Integer.parseInt(stdin.readLine());
                if ( c2 == 0 )
                {
                    System.out.println("\n"+complains);
                }
                else
                {
                    System.out.println("Error in Input.\nYour complaint has been registered. Thank You ! We shall work to improve our services");
                }
                break ;
                case 2 :
                System.out.println("Enter your Feedback : ");
                String feed = stdin.readLine() ; cp = 1 ;
                System.out.println("\u000cThank You for your valuable Feedback. We really appreciate it.\nThank You for chosing Grocers. ");
                break ;

                default : System.out.print("\u000c");
                System.out.println("Error in Input - Try Again");
                System.out.println("\n") ; continue comp ;
            }
        }while ( cp == 0 ) ;
    }

    public void contact() throws IOException
    {
        System.out.println("\u000c");
        System.out.println("Got Queries ? \n\n Feel free and write to us @ : \n");
        System.out.println(" Email - sourav.info@grocers.com ");
        System.out.println(" Phone - 1234567890 ") ;
        System.out.println(" Address - \n\tClass X-D , ");
        System.out.println("\tFifth Floor ,\n\tHFS building , Thane.");
        System.out.println("\tPIN - 400607 ");
    }
    
    public void delay()
    {
        System.out.println("\u000cLoading ... ");
        for ( long i = -99800000 ; i <= 99800000 ; i++ )
        {
        }
        for ( long i = -99800000 ; i <= 99800000 ; i++ )
        {
        }
    }
}
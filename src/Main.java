import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    /* Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
        unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.  */

        String username = "patika", inputUserName;
        String password = "java1234", inputPassword, inputNewPassword;
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print("Kullanıcı Adınız :");
            inputUserName = inp.next();
            System.out.print("Şifreniz : ");
            inputPassword = inp.next();

            if (inputUserName.equals(username) && inputPassword.equals(password)) {
                System.out.print("Giriş Başarılı!");
                break;
            } else {
                System.out.print("Hatalı bilgi girdiniz.");
                System.out.print("Şifrenizi değiştirmek ister misiniz (evet/hayır) :");
                if (inp.next().equals("evet")) {
                    while (true) {
                        System.out.print("Yeni şifrenizi giriniz :");
                        inputNewPassword = inp.next();
                        if (!inputNewPassword.equals(password) && !inputNewPassword.equals(inputPassword)){
                            password = inputNewPassword;
                            System.out.println("Yeni şifreniz oluşturuldu !");
                            break;
                        } else {
                            System.out.println("Şifreniz oluşturulamadı, lütfen tekrar deneyiniz !");
                        }

                    }
                }
            }
        }
    }
}
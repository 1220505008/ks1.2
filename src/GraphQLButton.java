//javada kullanılacak ilgili paketleri import ettik
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GraphQLButton sınıfını JButton sınıfından türettik
public class GraphQLButton extends JButton {

    //aktif ve pasif durumlar için renk tanımlamaları
    private static Color aktifRenk = Color.GREEN;//aktif kırmızı renk
    private static Color pasifRenk = Color.BLUE;//pasif mavi renk
    private static ImageIcon aktifIcon =new ImageIcon("aktif.png");//aktif simge
    private static ImageIcon pasifIcon =new ImageIcon("pasif.png");//pasif simge
    

    //butonun bağlı olduğu GraphQL şema adresinı tanımladık
    private String graphqlSemaAdres;

    //butonun durumu (aktif veya pasif)
    private boolean aktifMi = false;//"aktif mi?" sorusuna cevabını tutacak bir değişkeni false değeriyle tanımladık

    //GraphQLButton sınıfının kurucu metodunu tanımladık
    public GraphQLButton(String graphqlSemaAdres) {
        super();//üst sınıfın yapıcı metodunu çağırarak JButtonu başlattık

        //GraphQL şema adresini sınıfın özelliğine atadık(Buton nesnesinin bu şemaya yazacağı bilgi property olarak ayarlanabilir olacaktır.)
        this.graphqlSemaAdres = graphqlSemaAdres;

        //butonun varsayılan rengini ve simgesini pasif olarak ayarladık çünkü başlangıçta pasif durumda olacak
        this.setBackground(pasifRenk);
        this.setIcon(pasifIcon);

        //butona tıklandığında handleClick() metodunun çağrılmasını sağlayan olay dinleyicisi eklenir.
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClick();//butona tıklandığında çalışacak metodu çağırdık
            }
        });
    }

    // Buton üzerine tıklandığında yapılacak işlemleri içeren metot tanımladık
    public void handleClick() {
        //butonun pasif (aktifMi=false) durumdaysa
        if (!aktifMi) {
            //butonu aktif hale getir
            setActive();
            // GraphQL mutation'ını çalıştırma
            runGraphQLMutation();
        } else {//buton aktif (aktifMi=true) durumdaysa
            setInactive();//butonu pasif hale getir
        }
    }

    //butonu aktif hale getiren metot tanımladık
    private void setActive() {
        setActiveColors();//butonun rengini ve simgesini aktif hale getir
        aktifMi = true;//buton durumunu aktif olarak güncelle
    }

    //butonu pasif hale getiren metot tanımladık
    private void setInactive() {
        setInactiveColors();//butonun rengini ve simgesini pasif hale getir
        aktifMi = false;//buton durumunu pasif olarak güncelle
    }



    //butonu aktif hale getirildiğinde uygulanacak renk ve simge ayarları
    private void setActiveColors() {
        this.setBackground(aktifRenk);//butonun arka plan rengini aktif renk olarak ayarla
        this.setIcon(aktifIcon);//butonun simgesini aktif simge olarak ayarla
    }

    //butonun pasif hale getirildiğinde uygulanacak renk ve simge ayarları
    private void setInactiveColors() {
        this.setBackground(pasifRenk);//butonun arka plan rengini pasif renk olarak ayarla
        this.setIcon(pasifIcon);//butonun simgesini pasif simge olarak ayarla
    }

    // GraphQL mutationını çalıştıran metot
    private void runGraphQLMutation() {
        System.out.println("GraphQL mutationın çalıştığı adres: " + graphqlSemaAdres);
    }



    //Ana metot
    public static void main(String[] args) {
        //yeni bir JFrame ouşturduk
        JFrame frame = new JFrame("Aktif ve Pasif Butonlar");

        //tablo düzenini 4x4 grid olarak ayarladık
        frame.setLayout(new GridLayout(4, 4));

        //4x4 düzende butonları oluşturduk ve tabloya ekledik
        for (int i = 0; i < 4; i++) {//i satırı temsil ediyor
            for (int j = 0; j < 4; j++) {//j sütunu temsil ediyor
                //her butonun bağlı olacağı dummy GraphQL şema adresini vererek buton oluşturduk
                GraphQLButton buton = new GraphQLButton("http://dummy.graphql.schema");
                frame.add(buton);//butonu tabloya ekledik
            }
        }


        frame.setSize(600, 400);//tablonun yani frame'in boyutunu ayarladık
        frame.setVisible(true);//tabloyu görünür hale getirdik böylece ekranda pencere açılacak
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//pencere kapatıldığında kodun arkaplanda çalışmasını durdurduk

    }
}

# ks1.2
3.dönem ks1.2

Proje adı: Aktif ve Pasif Durumlu Butonlar

Proje Açıklaması:

Bu proje, Java Swing kullanılarak aktif ve pasif durumlu butonları temsil eden özel bir JButton sınıfı olan GraphQLButton'ı oluşturur. Her bir buton, bir GraphQL şema adresine bağlıdır ve kullanıcılar tarafından tıklanarak aktif veya pasif duruma getirilebilir. Buton durumu değiştikçe, arka plan rengi ve simgesi dinamik olarak güncellenir. Butonlar bir tablo oluşturmaktadır ve 4x4 şeklindedir. Ekran üzerinde yer alan her buton standart Java GUI butondan override edilerek oluşturulmuştur. Buton nesnesinin iki durumu vardır. bir tanesi aktif durum, bir tanesi pasif durumdur. Buton aktif durumda aktif renk ve aktif simge görünmektedir, buton pasif durumda ise pasif renk ve pasif simge görünmektedir. Yeşil renk ve A simgesi aktif durumu temsil ederken mavi renk ve P simgesi başlangıçta da olduğu gibi pasif durumu temsil etmektedir. Eğer ekranda 1. Butona basıldıktan sonra 2. Ve daha sonraki herhangi bir 
sıradaki basılmamış butona basıldığında onlarda aktif renk ve aktif simge(yeşil ve A) gösterecektir. Ancak 1. Butona tekrar basılırsa önceden basılmış butonlar(varsa) pasif hale gelecektir ve sadece tekrar basılan buton aktif olacaktır.



Butonların Kullanımı:

Butonların durumu, üzerine tıklandığında değişir. Buton tıklanmadığı sürece durumu pasiftir. Butona ilk kez tıklandığında, buton aktif hale gelir ve GraphQL mutation'ı çalıştırır. Butona tekrar tıklandığında, buton pasif hale gelir.

Önkoşullar:

Java 11 veya üzeri dilleri çalıştıran ide

Kurulum:

Projeyi GitHub'dan indirin.
Proje klasörünü ide üzerinden açın

Test Etme veya Kullanım:

Projeyi açtıktan sonra uygulamayı başlatın
Uygulamayı başlattıktan sonra ekranda 4x4 düzende butonlar içeren bir pencere açılacaktır.
Açılan pencerede uygulamayı test edebilirsiniz.
Ayrıca isterseniz de uygulamaya ait ilgili kısavideoyu da görmek isterseniz projeyi yüklediğim github profilimdeki ks1.2 altında bulabilirsiniz.

Butonların Kullanımı:

Butonların durumu, üzerine tıklandığında değişir. Butona ilk kez tıklandığında, buton aktif hale gelir ve GraphQL mutation'ı çalıştırır. Butona tekrar tıklandığında, buton pasif hale gelir.

GraphQL Mutation:

bu projede, GraphQL'in bir özelliği olan mutation'lar kullanılmıştır. Mutation'lar, bir veri kaynağında değişiklik yapmak için kullanılan sorgulardır. Bu kodda, butona tıklandığında, butonun durumunu (aktif veya pasif) değiştirmek için bir mutation çalıştırılmaktadır.
Her GraphQLButton nesnesi, bir GraphQL şema adresi ile ilişkilidir. Buton, aktif veya pasif durumda olabilir ve tıklama olaylarına göre durumu değiştiren bir işlevselliğe sahiptir. Ayrıca, her bir durum için farklı renkler ve simgeler tanımlanmıştır.
Projedeki GraphQLButton sınıfı, JButton sınıfından türetilmiştir. Bu sayede, GraphQLButton sınıfı, JButton sınıfının tüm özelliklerini ve metotlarını miras alır. GraphQLButton sınıfında, butonun bağlı olduğu GraphQL şema adresi, butonun durumu ve butona tıklandığında yapılacak işlemler gibi özellikler tanımlanmıştır.
Kodun ana metodunda, bir JFrame oluşturulur ve butonlar bu JFrame'e eklenir. Butonlar oluşturulurken, her butonun bağlı olacağı GraphQL şema adresi verilir. Butona tıklandığında, handleClick() metodu çağrılır. Bu metodda, butonun durumu kontrol edilir. Buton pasif durumdaysa, aktif hale getirilir ve bir mutation çalıştırılır. Buton aktif durumdaysa, pasif hale getirilir. Butonlar, GraphQL şema adresine bağlı olarak bir GraphQL mutation'ı çalıştırabilir. Mutation'ın çalışacağı adres, butonun oluşturulurken verilen parametredir. bu projede butona tıklandığında, butonun durumunu değiştirmek için bir mutation çalıştırılmaktadır. Kod aynı zamanda bir JFrame içinde 4x4 bir düzen oluşturarak bir dizi GraphQLButton örneği ekler. Bu örneklere dummy GraphQL şema adresleri verilmiştir. Programın amacı, bu butonları kullanarak GraphQL mutation'larını tetiklemektir. Örneğin, bir butona tıklandığında, ilgili GraphQL şema adresine bir mutation çağrısı yapılır. Sonuç olarak, bu kod örnek bir kullanıcı arayüzü oluşturur ve bu arayüz üzerinden GraphQL ile etkileşimde bulunmayı sağlar.

Butonların renkleri ve simgeleri, butonun durumuna göre değişir. Butonlara tıklandığında, butonun durumu hakkında bir mesaj konsola yazdırılır.


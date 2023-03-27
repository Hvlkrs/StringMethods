import java.util.Arrays;

public class Main {
            public static <String> void main(String[] args) {
                System.out.println("Java String Sınıfı Metotları!");

// charAt(): Belirtilen indisteki (konum) karakteri verir. char döndürür
                String myStr = "Hello";
                char result1 = ((java.lang.String) myStr).charAt(0);
                System.out.println(result1);

// codePointAt(): Belirtilen indisteki karakterin Unicode'unu verir. int döndürür.
                int result2 = ((java.lang.String) myStr).codePointAt(0);
                System.out.println(result2);

// codePointBefore(): Belirtilen indisteki önceki karakterin Unicode'unu verir. int döndürür.
                int result3 = ((java.lang.String) myStr).codePointBefore(1);
                System.out.println(result3);

// codePointCount(): Bu dizenin belirtilen metin aralığındaki Unicode'u döndürür. int döndürür.
                int result4 = ((java.lang.String) myStr).codePointCount(0, 5);
                System.out.println(result4);

// compareTo(): İki dizeyi sözlükbilimsel olarak karşılaştırır. int döndürür.
                String myStr1 = "Hello";
                String myStr2 = "Hello";
                System.out.println(((java.lang.String) myStr1).compareTo(myStr2)); // Returns 0 because they are equal

// concat(): Başka bir String'in sonuna bir karakter ekler. String döndürür.
                String firstName = "Hivel ";
                String lastName = "K";
                System.out.println(((java.lang.String) firstName).concat(lastName));

// contains(): Bir dizenin bir dizi karakter içerip içermediğini kontrol eder. boolean döndürür.
                String myStr3 = "Hello";
                System.out.println(((java.lang.String) myStr3).contains("Hel"));   // true
                System.out.println(((java.lang.String) myStr3).contains("e"));     // true
                System.out.println(((java.lang.String) myStr3).contains("Hi"));    // false

// contentEquals(): Bir dizenin, belirtilen aynı karakter dizisini içerip içermediğini kontrol eder. boolean döndürür.

                String myStr5 = "Hello";
                System.out.println(((java.lang.String) myStr5).contentEquals("Hello"));  // true
                System.out.println(((java.lang.String) myStr5).contentEquals("e"));      // false
                System.out.println(((java.lang.String) myStr5).contentEquals("Hi"));     // false

// endsWith(): Bir dizenin belirtilen karakter (ler) ile bitip bitmediğini kontrol eder. boolean döndürür.
                String myStr6 = "Hello";
                System.out.println(((java.lang.String) myStr6).endsWith("Hel"));   // false
                System.out.println(((java.lang.String) myStr6).endsWith("llo"));   // true
                System.out.println(((java.lang.String) myStr6).endsWith("o"));     // true

// equals(): İki dizgiyi karşılaştırır. Dizeler eşitse doğru, değilse yanlış döndürür. boolean döndürür.
                String myStr7 = "Hello";
                String myStr8 = "Hello";
                String myStr9 = "Another String";
                System.out.println(myStr7.equals(myStr8)); // Returns true because they are equal
                System.out.println(myStr7.equals(myStr9)); // false

// equalsIgnoreCase(): Büyük / küçük harfe ilişkin hususları göz ardı ederek iki dizeyi karşılaştırır. boolean döndürür.
                String myStr10 = "Hello";
                String myStr11 = "HELLO";
                String myStr12 = "Another String";
                System.out.println(((java.lang.String) myStr10).equalsIgnoreCase(myStr11)); // true
                System.out.println(((java.lang.String) myStr10).equalsIgnoreCase(myStr12)); // false

// hashCode(): Bir dizenin karma kodunu verir. int döndürür.
                String myStr13 = "Hello";
                System.out.println(myStr13.hashCode());

// indexOf(): Bir dizede belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir. int döndürür.
                String myStr14 = "Hello planet earth, you are a great planet.";
                System.out.println(((java.lang.String) myStr14).indexOf("planet"));


// isEmpty(): Bir dizenin boş olup olmadığını kontrol eder. boolean döndürür.
                String myStr15 = "Hello";
                String myStr16 = "";
                System.out.println(myStr15.isEmpty());
                System.out.println(myStr16.isEmpty());


// lastIndexOf(): Bir dizede belirtilen karakterlerin son bulunan oluşumunun konumunu verir. int döndürür.
                String myStr17 = "Hello planet earth, you are a great planet.";
                System.out.println(myStr17.lastIndexOf("planet"));

// length(): Belirtilen bir dizenin uzunluğunu verir. int döndürür.
                String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                System.out.println(txt.length());

// replace(): Belirli bir değer için bir dize arar ve belirtilen değerlerin değiştirildiği yeni bir dize döndürür. String döndürür.
                String myStr18 = "Hello";
                System.out.println(myStr18.replace('l', 'p'));

// startsWith()	Bir dizenin belirtilen karakterlerle başlayıp başlamadığını kontrol eder. boolean döndürür.
                String myStr19 = "Hello";
                System.out.println(myStr19.startsWith("Hel"));   // true
                System.out.println(myStr19.startsWith("llo"));   // false
                System.out.println(myStr19.startsWith("o"));     // false

// // toLowerCase(): Bir dizeyi küçük harflere dönüştürür. String döndürür.
                String txt1 = "Hello World";
                System.out.println(txt1.toUpperCase());
                System.out.println(txt1.toLowerCase());

// toUpperCase(): Bir dizeyi büyük harflere dönüştürür. String döndürür.
                String txt2 = "Hello WorldI";
                System.out.println(txt2.toUpperCase());
                System.out.println(txt2.toLowerCase());

// trim(): Bir dizenin her iki ucundaki boşluğu kaldırır. String döndürür.
                String myStr20 = "       Hello World!       ";
                System.out.println(myStr20);
                System.out.println(myStr20.trim());



// copyValueOf(): Karakter dizisinin karakterlerini temsil eden bir Dizi döndürür. String döndürür.
                char[] myStr21 = {'H', 'e', 'l', 'l', 'o'};
                String myStr22 = "";
                myStr22 = myStr22.copyValueOf(myStr21, 0, 5);
                System.out.println("Returned String: " + myStr22); // Sonuc: Returned String: Hello

// getChars(): Karakterleri bir dizeden bir karakter dizisine kopyalar.	void döndürür.
                String str23 = "Welcome! to GeeksforGeeks";

                char[] destArray = new char[20];
                try {
                    str23.getChars(12, 25, destArray, 0);
                    System.out.println(destArray); // Sonuc: GeeksforGeeks
                }
                catch (Exception ex) {
                    System.out.println(ex);
                }
// matches(): Normal bir ifadeye karşı bir eşleşme için bir dize arar ve eşleşmeleri döndürür. boolean döndürür.
                String Str24 = new String("Welcome to geeksforgeeks");

                // Initializing test string
                String Str25 = new String("GEEKS");

                // Tests whether GEEKS starts in geeksforgeeks
                // starting from pos 11 and
                // compares 5 characters of GEEKS
                System.out.print(
                        "Checking if GEEKS is in geeksforgeeks( case sensitive ) : ");
                System.out.println(Str24.regionMatches(11, Str25, 0, 5)); // Sonuc: (case sensitive) : false

// offsetByCodePoints(): CodePointOffset kod noktaları tarafından verilen dizinden uzak olan bu Dize içindeki dizini döndürür. int döndürür.

// regionMatches(): İki dizi bölgesinin eşit olup olmadığını test eder. boolean döndürür.

// replaceFirst(): Verilen normal ifadeyle eşleşen bir alt dizenin ilk oluşumunu verilen değiştirmeyle değiştirir. String döndürür.

// replaceAll(): Verilen normal ifadeyle eşleşen bu dizenin her bir alt dizesini verilen değiştirmeyle değiştirir. String döndürür.

// split(): Bir dizeyi bir alt dizeye böler. String[] döndürür.
                String isim= "Ayse, Fatma, Hayriye";

                String [] isimler= isim.split(",");

                System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));//[Ayse,  Fatma,  Hayriye]


// subSequence(): Bu dizinin bir alt dizisi olan yeni bir karakter dizisi verir. CharSequence döndürür.

// substring(): Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak ve belirtilen karakter sayısıyla ayıklar. String döndürür.

                String sehirler="Ankara, Antalya, Mersin";
                String x=sehirler.substring(0,6);
                System.out.println("x = " + x);//x = Ankara

// toCharArray(): Bu dizeyi yeni bir karakter dizisine dönüştürür. char[] döndürür.

// valueOf(): Bir String nesnesinin ilkel değerini verir. String döndürür.

            }
        }
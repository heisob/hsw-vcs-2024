public class Einmaleins
{
   public static void main (String args[]) {
      int     aussen,   innen;
      for (aussen=1 ; aussen<=10 ; aussen++)
         for (innen=1 ; innen<=10 ; innen++)
            System.out.format("%30d * %2d = %3d\n", aussen, innen, aussen*innen);
   }
}

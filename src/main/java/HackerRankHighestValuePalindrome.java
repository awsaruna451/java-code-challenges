import java.util.HashMap;
import java.util.Map;

public class HackerRankHighestValuePalindrome {

    public static String highestValuePalindrome(String s, int n, int k) {
        // Write your code here
        int count = 0;
        Map<Integer, Integer> notMappint = new HashMap<>();
        Map<Integer, Integer> maxMappint = new HashMap<>();

        for (int a = 0; a < n/2 ; a++) {
            int num1 = Integer.parseInt(s.substring(a, a+1));
            int num2 = Integer.parseInt(s.substring((n-1-a), (n-a)));
            if ( num1 != num2) {
                if (num1 > num2) {
                    notMappint.put((n-1-a), num1);
                    if (num1 <= 9) {
                        maxMappint.put(a, 9);
                        maxMappint.put((n-1-a), 9);
                    } else {
                        maxMappint.put(a, num1);
                    }
                } else {
                    notMappint.put(a, num2);
                    if (num2 <= 9) {
                        maxMappint.put(a, 9);
                        maxMappint.put((n-1-a), 9);
                    } else {
                        maxMappint.put(a, num2);
                    }
                }
                count++;
            }
            if (count > k) {
                return "-1";
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (maxMappint.size() <= k) {
            for (int y = 0; y < n ; y++) {
                if (maxMappint.get(y) != null) {
                    stringBuilder.append(maxMappint.get(y));
                } else {
                    stringBuilder.append(s.charAt(y));
                }

            }
        } else {
            for (int y = 0; y < n ; y++) {
                if (maxMappint.get(y) != null) {
                    stringBuilder.append(maxMappint.get(y));
                } else {
                    stringBuilder.append(s.charAt(y));
                }

            }
        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(highestValuePalindrome("7540786870804153637268138688816467943880446180812636084005978825303242906030309557834147725061225972435349888354336471995620649219145709633594147385080425552362716965827603039707956812381570316278751836780765835012863894149171086648087337401128413581725340243679640025813263720061696684409326677129804605150006860698274364450896903479456955974379802394665597989292155217390837134454530020520783272905126602495077462370339326986809965692921431023230747946696819247251046724037946109491934755451607555320501843544591789711113845539347776669060897086410914282414458902686036860332836222652501148144025403708899310731498844152239481235612077391031102937917642991807016526292731095471248880844440463856641557483875051139400738203631062400922994938655959248216643567935832713768038525277158213525216670370303754489345491358747552690599420409650285326598895107250752705955245732486376649225812868894395983302524941508717407626843594625762112487552087854702097675426573074748566261463298338826084697892407242685180174698", 22299, 94425));
    }
}

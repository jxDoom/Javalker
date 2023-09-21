package FirstTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class SQLTask {
    public static void main(String[] args) {
        String sql = "select * from students where ";
        String stringSQL = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        String[] tmpSQL = stringSQL.split(","); // разделили на подстроки
        StringBuilder clearSQL = new StringBuilder();
        for (String s : tmpSQL) {
            if (!s.contains("null")) clearSQL.append(s);
        } // избавились от подстрок с null

        stringSQL = clearSQL.toString();
        String[] res = stringSQL.replace('{', ' ').replace('}', ' ').split(" ");
        String[] resTMP;
        // в каждую подстроку разделим на левую и правую части, в левой удалим " в правой заменим на '
        StringBuilder result = new StringBuilder(sql);
        for (int i = 0; i < res.length; i++) {
            resTMP = res[i].split(":");
            resTMP[0] = resTMP[0].replaceAll("\"", "");
            resTMP[1] = resTMP[1].replaceAll("\"", "'");
            res[i] = String.join(" = ", resTMP[0], resTMP[1]);
            if (i != res.length - 1) {
                result.append(res[i].concat(" AND "));
            } else result.append(res[i]);
        }
        System.out.println(result);
//--------------------------------------------------------------------------------
//        String QUERY = "select * from students where ";
//        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//        PARAMS = PARAMS.replace(":", "=").replace("{", "").replace("}", "").replace("\"", "").replace(" ", "");
//        String[] ParamsSplitted = PARAMS.split(",");
////        System.out.println(Arrays.toString(ParamsSplitted));
//        StringBuilder stringBuilder = new StringBuilder(QUERY);
//        PARAMS = DeleteNullArgs(ParamsSplitted);
////        System.out.println(DeleteNullArgs(ParamsSplitted));
//        stringBuilder.append(PARAMS);
//        System.out.println(stringBuilder);
    }

//    public static String DeleteNullArgs(String[] parameters) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        for (int i = 0; i < parameters.length; i++) {
//            String[] tempArray = parameters[i].split("=");
//            if (!Objects.equals(tempArray[1], "null")) {
//                tempArray[1] = "'" + tempArray[1] + "'";
//                arrayList.add(tempArray[0] + "=" + tempArray[1]);
//            }
//        }
//        return arrayList.toString().replace("[", "").replace("]", "").replace(",", " and");
//    }
}


import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

    public class Main {
        private static String JSON =
                "{ \"propertyName\": \"Surface\", \"propertyDisplayName\": \"Surface\"," +
                       "\"isHydrophobic\": \"yes\" }";

        public static void main(String args[]) throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            SimpleCharacterizationProperty c = objectMapper.readValue(JSON, SimpleCharacterizationProperty.class);
            System.out.println(c.getPropertyDisplayName() + " " + c.getPropertyName());
            SimpleSurface ss = (SimpleSurface)c;
            System.out.println(ss.getIsHydrophobic());
        }
    }
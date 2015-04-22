cd elong
#Linux


#Mac
rm -f ArrayOf*.java
rm -f ObjectFactory.java

sed -i '' -e 's/javax\.xml\.datatype\.XMLGregorianCalendar/java.util.Date/g' *.java
sed -i '' -e 's/XMLGregorianCalendar/java.util.Date/g' *.java

sed -i '' -e 's/, required = true//g' *.java
sed -i '' -e 's/, nillable = true//g' *.java
sed -i '' -e 's/, type = Boolean.class//g' *.java
sed -i '' -e 's/, type = Integer.class//g' *.java

sed -i '' -e 's/@XmlElement/@JSONField/g' *.java

sed -i '' -e 's/ \([A-Za-z0-9_]\{1,100\}\)("\([A-Za-z0-9_]\{1,100\}\)")/ \2("\2")/g'  *Enum*.java

sed -i '' -e 's/ArrayOf\([A-Za-z0-9_]\{1,100\}\) /List<\1> /g' *.java

sed -i '' -e 's/HotelRoom1/HotelRoom/g' *.java
sed -i '' -e 's/PaymentCardCategory1/PaymentCardCategory/g' *.java


sed -i '' -e 's/import javax\.xml\.bind\.annotation\.XmlElement;/import javax.xml.bind.annotation.XmlElement; \
import java.util.List; \
import com.alibaba.fastjson.annotation.JSONField;/g' *.java




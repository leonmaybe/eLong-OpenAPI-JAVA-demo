#!/bin/bash

xjc -p elong api-comm*.xsd
xjc -p elong hotel-v*.xsd

cd elong
#Linux


#Mac
echo "remove some files..."
rm -f ArrayOf*.java
rm -f ObjectFactory.java

echo "replace something...."
sed -i '' -e 's/javax\.xml\.datatype\.XMLGregorianCalendar/java.util.Date/g' *.java
sleep 1
sed -i '' -e 's/XMLGregorianCalendar/java.util.Date/g' *.java
sleep 1
sed -i '' -e 's/, required = true//g' *.java
sleep 1
sed -i '' -e 's/, nillable = true//g' *.java
sleep 1
sed -i '' -e 's/@JSONField(required = true)//g' *.java
sleep 1
sed -i '' -e 's/, type = Boolean.class//g' *.java
sleep 1
sed -i '' -e 's/, type = Integer.class//g' *.java
sleep 1
sed -i '' -e 's/, type = Long.class//g' *.java
sleep 1
sed -i '' -e 's/@XmlElement/@JSONField/g' *.java
sleep 1
sed -i '' -e 's/ \([A-Za-z0-9_]\{1,100\}\)("\([A-Za-z0-9_]\{1,100\}\)")/ \2("\2")/g'  *Enum*.java
sleep 1
sed -i '' -e 's/ArrayOfInt/ArrayOfInteger/g' *.java
sleep 1
sed -i '' -e 's/ArrayOf\([A-Za-z0-9_]\{1,100\}\) /List<\1> /g' *.java
sleep 1
sed -i '' -e 's/HotelRoom1/HotelRoom/g' *.java
sleep 1
sed -i '' -e 's/PaymentCardCategory1/PaymentCardCategory/g' *.java
sleep 1
sed -i '' -e 's/import javax\.xml\.bind\.annotation\.XmlElement;/import javax.xml.bind.annotation.XmlElement; \
import java.util.List; \
import com.alibaba.fastjson.annotation.JSONField;/g' *.java

echo "copy files to destination dir."
 cp -f  *.java  ../src/elong/
 
 
 echo ""
 echo ""
 echo "======  Successfully done!  ============"


echo "####################################################"
echo "####################################################"
echo Compiling Modules
echo "####################################################"
echo "####################################################"

mvn clean install

echo "####################################################"
echo "####################################################"
echo Starting Service
echo "####################################################"
echo "####################################################"

cd SpringModule
mvn spring-boot:run
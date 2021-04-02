curl http://andromeda.fi.muni.cz/~xbatko/homework1.ior > hw01.ior
mkdir out || true # allowed to fail
javac -d out src/Client.java src/**/*.java
cat hw01.ior | xargs java -cp out Client ||\
echo "Something fucked up 😒"

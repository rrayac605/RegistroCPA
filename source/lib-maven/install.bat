call mvn install:install-file -Dfile="jfxrt.jar" -DgroupId="com.oracle" -DartifactId="javafx" -Dversion="2.2" -Dpackaging="jar"
call mvn install:install-file -Dfile="imss-ws-clientes-pensiones-1.0.jar" -DgroupId="mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws" -DartifactId="imss-ws-clientes-pensiones" -Dversion="1.0" -Dpackaging="jar"
call mvn install:install-file -Dfile="ojdbc6-11.2.0.2.0.jar" -DgroupId="com.oracle" -DartifactId="ojdbc6" -Dversion="11.2.0.2.0" -Dpackaging="jar"
call mvn install:install-file -Dfile="imss-ws-clients-2.5.jar" -DgroupId="mx.gob.imss" -DartifactId="imss-ws-clients" -Dversion="2.5" -Dpackaging="jar"
call mvn install:install-file -Dfile="ClientesWebservices-sat-consulta-rfc-2.2.jar" -DgroupId="mx.gob.imss.ctirss.clienteswebservices.sat.consulta.rfc" -DartifactId="ClientesWebservices-sat-consulta-rfc" -Dversion="2.2" -Dpackaging="jar"
call mvn install:install-file -Dfile="delta-modelo-negocio-2.6-SNAPSHOT.jar" -DgroupId="mx.gob.imss.ctirss.delta" -DartifactId="delta-modelo-negocio" -Dversion="2.6-SNAPSHOT" -Dpackaging="jar"
call mvn install:install-file -Dfile="delta-framework-base-2.6-SNAPSHOT.jar" -DgroupId="mx.gob.imss.ctirss.delta" -DartifactId="delta-framework-base" -Dversion="2.6-SNAPSHOT" -Dpackaging="jar"
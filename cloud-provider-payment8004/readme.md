> CAP原则又称CAP定理，指的是在一个分布式系统中，一致性（Consistency）、可用性（Availability）、分区容错性（Partition tolerance）。CAP 原则指的是，这三个要素最多只能同时实现两点，不可能三者兼顾。

zookeeper 是CP 强一致性的


[https://www.yht7.com/news/95644](https://www.yht7.com/news/95644)

* 进入zookeeper shell终端

```shell
(base) root@klein:/home/klein# docker exec -it zk0 bash
root@73dd67ae6722:/apache-zookeeper-3.6.2-bin# cd bin/
root@73dd67ae6722:/apache-zookeeper-3.6.2-bin/bin# ls
README.txt    zkCli.cmd  zkEnv.cmd  zkServer-initialize.sh  zkServer.sh            zkSnapShotToolkit.sh  zkTxnLogToolkit.sh
zkCleanup.sh  zkCli.sh   zkEnv.sh   zkServer.cmd            zkSnapShotToolkit.cmd  zkTxnLogToolkit.cmd
```

* 启动zookeeper 服务

```shell
root@73dd67ae6722:/apache-zookeeper-3.6.2-bin/bin# ./zkServer.sh start
ZooKeeper JMX enabled by default
Using config: /conf/zoo.cfg
Starting zookeeper ... already running as process 120.
```



* 启动客户端：root@73dd67ae6722:/apache-zookeeper-3.6.2-bin/bin# ./zkCli.sh 

```shell
root@73dd67ae6722:/apache-zookeeper-3.6.2-bin/bin# ./zkCli.sh 
Connecting to localhost:2181
2020-12-01 02:53:12,191 [myid:] - INFO  [main:Environment@98] - Client environment:zookeeper.version=3.6.2--803c7f1a12f85978cb049af5e4ef23bd8b688715, built on 09/04/2020 12:44 GMT
2020-12-01 02:53:12,195 [myid:] - INFO  [main:Environment@98] - Client environment:host.name=73dd67ae6722
2020-12-01 02:53:12,196 [myid:] - INFO  [main:Environment@98] - Client environment:java.version=11.0.9.1
2020-12-01 02:53:12,198 [myid:] - INFO  [main:Environment@98] - Client environment:java.vendor=Oracle Corporation
2020-12-01 02:53:12,198 [myid:] - INFO  [main:Environment@98] - Client environment:java.home=/usr/local/openjdk-11
2020-12-01 02:53:12,200 [myid:] - INFO  [main:Environment@98] - Client environment:java.class.path=/apache-zookeeper-3.6.2-bin/bin/../zookeeper-server/target/classes:/apache-zookeeper-3.6.2-bin/bin/../build/classes:/apache-zookeeper-3.6.2-bin/bin/../zookeeper-server/target/lib/*.jar:/apache-zookeeper-3.6.2-bin/bin/../build/lib/*.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/zookeeper-prometheus-metrics-3.6.2.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/zookeeper-jute-3.6.2.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/zookeeper-3.6.2.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/snappy-java-1.1.7.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/slf4j-log4j12-1.7.25.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/slf4j-api-1.7.25.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/simpleclient_servlet-0.6.0.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/simpleclient_hotspot-0.6.0.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/simpleclient_common-0.6.0.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/simpleclient-0.6.0.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/netty-transport-native-unix-common-4.1.50.Final.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/netty-transport-native-epoll-4.1.50.Final.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/netty-transport-4.1.50.Final.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/netty-resolver-4.1.50.Final.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/netty-handler-4.1.50.Final.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/netty-common-4.1.50.Final.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/netty-codec-4.1.50.Final.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/netty-buffer-4.1.50.Final.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/metrics-core-3.2.5.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/log4j-1.2.17.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/json-simple-1.1.1.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jline-2.14.6.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jetty-util-9.4.24.v20191120.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jetty-servlet-9.4.24.v20191120.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jetty-server-9.4.24.v20191120.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jetty-security-9.4.24.v20191120.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jetty-io-9.4.24.v20191120.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jetty-http-9.4.24.v20191120.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/javax.servlet-api-3.1.0.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jackson-databind-2.10.3.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jackson-core-2.10.3.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/jackson-annotations-2.10.3.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/commons-lang-2.6.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/commons-cli-1.2.jar:/apache-zookeeper-3.6.2-bin/bin/../lib/audience-annotations-0.5.0.jar:/apache-zookeeper-3.6.2-bin/bin/../zookeeper-*.jar:/apache-zookeeper-3.6.2-bin/bin/../zookeeper-server/src/main/resources/lib/*.jar:/conf:
2020-12-01 02:53:12,200 [myid:] - INFO  [main:Environment@98] - Client environment:java.library.path=/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2020-12-01 02:53:12,200 [myid:] - INFO  [main:Environment@98] - Client environment:java.io.tmpdir=/tmp
2020-12-01 02:53:12,201 [myid:] - INFO  [main:Environment@98] - Client environment:java.compiler=<NA>
2020-12-01 02:53:12,203 [myid:] - INFO  [main:Environment@98] - Client environment:os.name=Linux
2020-12-01 02:53:12,204 [myid:] - INFO  [main:Environment@98] - Client environment:os.arch=amd64
2020-12-01 02:53:12,204 [myid:] - INFO  [main:Environment@98] - Client environment:os.version=4.15.0-123-generic
2020-12-01 02:53:12,204 [myid:] - INFO  [main:Environment@98] - Client environment:user.name=root
2020-12-01 02:53:12,204 [myid:] - INFO  [main:Environment@98] - Client environment:user.home=/root
2020-12-01 02:53:12,205 [myid:] - INFO  [main:Environment@98] - Client environment:user.dir=/apache-zookeeper-3.6.2-bin/bin
2020-12-01 02:53:12,205 [myid:] - INFO  [main:Environment@98] - Client environment:os.memory.free=24MB
2020-12-01 02:53:12,209 [myid:] - INFO  [main:Environment@98] - Client environment:os.memory.max=256MB
2020-12-01 02:53:12,209 [myid:] - INFO  [main:Environment@98] - Client environment:os.memory.total=32MB
2020-12-01 02:53:12,217 [myid:] - INFO  [main:ZooKeeper@1006] - Initiating client connection, connectString=localhost:2181 sessionTimeout=30000 watcher=org.apache.zookeeper.ZooKeeperMain$MyWatcher@6166e06f
2020-12-01 02:53:12,260 [myid:] - INFO  [main:X509Util@77] - Setting -D jdk.tls.rejectClientInitiatedRenegotiation=true to disable client-initiated TLS renegotiation
2020-12-01 02:53:12,275 [myid:] - INFO  [main:ClientCnxnSocket@239] - jute.maxbuffer value is 1048575 Bytes
2020-12-01 02:53:12,316 [myid:] - INFO  [main:ClientCnxn@1716] - zookeeper.request.timeout value is 0. feature enabled=false
Welcome to ZooKeeper!
2020-12-01 02:53:12,373 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1167] - Opening socket connection to server localhost/127.0.0.1:2181.
2020-12-01 02:53:12,374 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1169] - SASL config status: Will not attempt to authenticate using SASL (unknown error)
2020-12-01 02:53:12,406 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@999] - Socket connection established, initiating session, client: /127.0.0.1:35750, server: localhost/127.0.0.1:2181
2020-12-01 02:53:12,430 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1433] - Session establishment complete on server localhost/127.0.0.1:2181, session id = 0x100000e4c8b0001, negotiated timeout = 30000

WATCHER::

WatchedEvent state:SyncConnected type:None path:null
JLine support is enabled
[zk: localhost:2181(CONNECTED) 0] ls /
```

* 在客户端操作

```shell
[zk: localhost:2181(CONNECTED) 0] ls /
[services, zookeeper]
[zk: localhost:2181(CONNECTED) 1] ls
ls [-s] [-w] [-R] path
[zk: localhost:2181(CONNECTED) 2] ls /services 
[cloud-provider-payment]
[zk: localhost:2181(CONNECTED) 3] ls /services/cloud-provider-payment 
[305ca35d-55fc-4b21-a8c8-74582694c48c]
[zk: localhost:2181(CONNECTED) 4] ls /services/cloud-provider-payment/305ca35d-55fc-4b21-a8c8-74582694c48c 
[]
[zk: localhost:2181(CONNECTED) 5] get /services/cloud-provider-payment/305ca35d-55fc-4b21-a8c8-74582694c48c 
{"name":"cloud-provider-payment","id":"305ca35d-55fc-4b21-a8c8-74582694c48c","address":"DESKTOP-AUK8T9H","port":8004,"sslPort":null,"payload":{"@class":"org.springframework.cloud.zookeeper.discovery.ZookeeperInstance","id":"application-1","name":"cloud-provider-payment","metadata":{}},"registrationTimeUTC":1606791533908,"serviceType":"DYNAMIC","uriSpec":{"parts":[{"value":"scheme","variable":true},{"value":"://","variable":false},{"value":"address","variable":true},{"value":":","variable":false},{"value":"port","variable":true}]}}
[zk: localhost:2181(CONNECTED) 6] 
```

* json解析后的内容

```json
{
  "name": "cloud-provider-payment",
  "id": "305ca35d-55fc-4b21-a8c8-74582694c48c",
  "address": "DESKTOP-AUK8T9H",
  "port": 8004,
  "sslPort": null,
  "payload": {
    "@class": "org.springframework.cloud.zookeeper.discovery.ZookeeperInstance",
    "id": "application-1",
    "name": "cloud-provider-payment",
    "metadata": {}
  },
  "registrationTimeUTC": 1606791533908,
  "serviceType": "DYNAMIC",
  "uriSpec": {
    "parts": [
      {
        "value": "scheme",
        "variable": true
      },
      {
        "value": "://",
        "variable": false
      },
      {
        "value": "address",
        "variable": true
      },
      {
        "value": ":",
        "variable": false
      },
      {
        "value": "port",
        "variable": true
      }
    ]
  }
}
```


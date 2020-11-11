# MapReduce in Java
By Sami BEHAT and Yehoudah AZOULAY
## 1.8.1 Disctrict with trees

Here, we write a MapReduce job that displays the list of distinct containing trees . 

```bat
yarn jar /home/yazoulay/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar district tree.csv district03
20/11/10 17:30:00 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 17:30:00 INFO hdfs.DFSClient: Created token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605025800983, maxDate=1605630600983, sequenceNumber=5660, masterKeyId=45 on ha-hdfs:efrei
20/11/10 17:30:01 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605025800983, maxDate=1605630600983, sequenceNumber=5660, masterKeyId=45)
20/11/10 17:30:01 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/yazoulay/.staging/job_1603290159664_3343
20/11/10 17:30:01 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 17:30:01 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 17:30:02 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3343
20/11/10 17:30:02 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605025800983, maxDate=1605630600983, sequenceNumber=5660, masterKeyId=45)]
20/11/10 17:30:02 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 17:30:02 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 17:30:02 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3343
20/11/10 17:30:02 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3343/
20/11/10 17:30:02 INFO mapreduce.Job: Running job: job_1603290159664_3343
20/11/10 17:30:13 INFO mapreduce.Job: Job job_1603290159664_3343 running in uber mode : false
20/11/10 17:30:13 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 17:30:22 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 17:30:32 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 17:30:33 INFO mapreduce.Job: Job job_1603290159664_3343 completed successfully
```
We can see that we have got the column of all the different districts who contain trees.
```bat
[yazoulay@hadoop-edge01 ~]$ hdfs dfs -cat /user/yazoulay/district07/part-r-00000  
11 1  
12 29  
13 2  
14 3  
15 1  
16 36  
17 1  
18 1  
19 6  
20 3  
3 1  
4 1  
5 2  
6 1  
7 3  
8 5  
9 1

```
## 1.8.2 Show species

Here, we writed a MapReduce job that displays the list of different species trees in this file.

```bat
[yazoulay@hadoop-edge01 ~]$ yarn jar /home/yazoulay/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar showspec tree.csv showspec02
20/11/10 23:38:26 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 23:38:26 INFO hdfs.DFSClient: Created token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605047906352, maxDate=1605652706352, sequenceNumber=6255, masterKeyId=46 on ha-hdfs:efrei
20/11/10 23:38:26 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605047906352, maxDate=1605652706352, sequenceNumber=6255, masterKeyId=46)
20/11/10 23:38:26 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/yazoulay/.staging/job_1603290159664_3707
20/11/10 23:38:27 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 23:38:27 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 23:38:27 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3707
20/11/10 23:38:27 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605047906352, maxDate=1605652706352, sequenceNumber=6255, masterKeyId=46)]
20/11/10 23:38:27 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 23:38:27 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 23:38:28 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3707
20/11/10 23:38:28 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3707/
20/11/10 23:38:28 INFO mapreduce.Job: Running job: job_1603290159664_3707
20/11/10 23:38:38 INFO mapreduce.Job: Job job_1603290159664_3707 running in uber mode : false
20/11/10 23:38:38 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 23:38:47 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 23:38:57 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 23:38:58 INFO mapreduce.Job: Job job_1603290159664_3707 completed successfully
```
This output shows us the different types of tree species ( first column ).

```bat
[yazoulay@hadoop-edge01 ~]$ hdfs dfs -cat /user/yazoulay/showspec02/part-r-00000
Acer    0
Aesculus        0
Ailanthus       0
Alnus   0
Araucaria       0
Broussonetia    0
Calocedrus      0
Catalpa 0
Cedrus  0
Celtis  0
Corylus 0
Davidia 0
Diospyros       0
Eucommia        0
Fagus   0
Fraxinus        0
Ginkgo  0
Gymnocladus     0
Juglans 0
Liriodendron    0
Maclura 0
Magnolia        0
Paulownia       0
Pinus   0
Platanus        0
Pterocarya      0
Quercus 0
Robinia 0
Sequoia 0
Sequoiadendron  0
Styphnolobium   0
Taxodium        0
Taxus   0
Tilia   0
Ulmus   0
Zelkova 0
```
Here, we writed a MapReduce job that calculates the height of the tallest tree of each kind.

## 1.8.3 Number of trees by species

Here we writed a MapReduce job that calculates the number of trees of each species.

```bat
[yazoulay@hadoop-edge01 ~]$ yarn jar /home/yazoulay/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar nbtrees tre  
e.csv nbtrees01  
20/11/11 00:30:40 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200  
20/11/11 00:30:41 INFO hdfs.DFSClient: Created token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605051041015, maxDate=1605655841015, sequenceNumber=6300, masterKeyId=46 on ha-hdfs:efrei  
20/11/11 00:30:41 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605051041015, maxDate=1605655841015, sequenceNumber=6300, masterKeyId=46)  
20/11/11 00:30:41 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/yazoulay/.staging/job_1603290159664_3731  
20/11/11 00:30:42 INFO input.FileInputFormat: Total input files to process : 1  
20/11/11 00:30:42 INFO mapreduce.JobSubmitter: number of splits:1  
20/11/11 00:30:42 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3731  
20/11/11 00:30:42 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605051041015, maxDate=1605655841015, sequenceNumber=6300, masterKeyId=46)]  
20/11/11 00:30:42 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml  
20/11/11 00:30:42 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190  
20/11/11 00:30:43 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3731  
20/11/11 00:30:43 INFO mapreduce.Job: The url to track the job: [https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3731/](https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3731/ "https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3731/")  
20/11/11 00:30:43 INFO mapreduce.Job: Running job: job_1603290159664_3731  
20/11/11 00:30:53 INFO mapreduce.Job: Job job_1603290159664_3731 running in uber mode : false  
20/11/11 00:30:53 INFO mapreduce.Job: map 0% reduce 0%  
20/11/11 00:31:02 INFO mapreduce.Job: map 100% reduce 0%  
20/11/11 00:31:08 INFO mapreduce.Job: map 100% reduce 100%  
20/11/11 00:31:08 INFO mapreduce.Job: Job job_1603290159664_3731 completed successfully
```
This output show us the occurence of each trees 
For exemple, there is three trees from specie Acer.

```bat
[yazoulay@hadoop-edge01 ~]$ hdfs dfs -cat /user/yazoulay/nbtrees01/part-r-00000  
Acer 3  
Aesculus 3  
Ailanthus 1  
Alnus 1  
Araucaria 1  
Broussonetia 1  
Calocedrus 1  
Catalpa 1  
Cedrus 4  
Celtis 1  
Corylus 3  
Davidia 1  
Diospyros 4  
Eucommia 1  
Fagus 8  
Fraxinus 1  
Ginkgo 5  
Gymnocladus 1  
Juglans 1  
Liriodendron 2  
Maclura 1  
Magnolia 1  
Paulownia 1  
Pinus 5  
Platanus 19  
Pterocarya 3  
Quercus 4  
Robinia 1  
Sequoia 1  
Sequoiadendron 5  
Styphnolobium 1  
Taxodium 3  
Taxus 2  
Tilia 1  
Ulmus 1  
Zelkova 4
```
## 1.8.4. Max Height
```bat
yarn jar /home/yazoulay/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar maxheight tree.csv maxheight04
20/11/10 18:38:27 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 18:38:27 INFO hdfs.DFSClient: Created token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605029907663, maxDate=1605634707663, sequenceNumber=5884, masterKeyId=46 on ha-hdfs:efrei
20/11/10 18:38:27 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605029907663, maxDate=1605634707663, sequenceNumber=5884, masterKeyId=46)
20/11/10 18:38:27 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/yazoulay/.staging/job_1603290159664_3459
20/11/10 18:38:28 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 18:38:28 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 18:38:28 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3459
20/11/10 18:38:28 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605029907663, maxDate=1605634707663, sequenceNumber=5884, masterKeyId=46)]
20/11/10 18:38:29 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 18:38:29 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 18:38:29 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3459
20/11/10 18:38:29 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3459/
20/11/10 18:38:29 INFO mapreduce.Job: Running job: job_1603290159664_3459
20/11/10 18:38:39 INFO mapreduce.Job: Job job_1603290159664_3459 running in uber mode : false
20/11/10 18:38:39 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 18:38:48 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 18:38:59 INFO mapreduce.Job:  map 100% reduce 100%
```
This output shows us the different types of tree species ( first column ) and the tallest tree of each species ( second column). We can see that the tallest tree is a Platanus.

```bat
[yazoulay@hadoop-edge01 ~]$ hdfs dfs -cat /user/yazoulay/maxheight04/part-r-00000
Acer    16
Aesculus        30
Ailanthus       35
Alnus   16
Araucaria       9
Broussonetia    12
Calocedrus      20
Catalpa 15
Cedrus  30
Celtis  16
Corylus 20
Davidia 12
Diospyros       14
Eucommia        12
Fagus   30
Fraxinus        30
Ginkgo  33
Gymnocladus     10
Juglans 28
Liriodendron    35
Maclura 13
Magnolia        12
Paulownia       20
Pinus   30
Platanus        45
Pterocarya      30
Quercus 31
Robinia 11
Sequoia 30
Sequoiadendron  35
Styphnolobium   10
Taxodium        35
Taxus   13
Tilia   20
Ulmus   15
Zelkova 30
```
Here, we writed a MapReduce job that sort the trees height from smallest to largest.

## 1.8.5 Sort tree by height
```bat
[yazoulay@hadoop-edge01 ~]$ yarn jar /home/yazoulay/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar sortheight
tree.csv sortheight01
20/11/10 22:58:12 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 22:58:12 INFO hdfs.DFSClient: Created token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605045492804, maxDate=1605650292804, sequenceNumber=6225, masterKeyId=46 on ha-hdfs:efrei
20/11/10 22:58:12 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605045492804, maxDate=1605650292804, sequenceNumber=6225, masterKeyId=46)
20/11/10 22:58:13 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/yazoulay/.staging/job_1603290159664_3686
20/11/10 22:58:13 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 22:58:13 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 22:58:14 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3686
20/11/10 22:58:14 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605045492804, maxDate=1605650292804, sequenceNumber=6225, masterKeyId=46)]
20/11/10 22:58:14 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 22:58:14 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 22:58:14 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3686
20/11/10 22:58:14 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3686/
20/11/10 22:58:14 INFO mapreduce.Job: Running job: job_1603290159664_3686
20/11/10 22:58:24 INFO mapreduce.Job: Job job_1603290159664_3686 running in uber mode : false
20/11/10 22:58:24 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 22:58:34 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 22:58:39 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 22:58:39 INFO mapreduce.Job: Job job_1603290159664_3686 completed successfully
```

This output shows us all the different trees defined by an object id ( second column ) and all of them are classified from the smallest to largest ( first column)

```bat
[yazoulay@hadoop-edge01 ~]$ hdfs dfs -cat /user/yazoulay/sortheight01/part-r-00000
0       67
2       3
5       89
6       62
9       39
10      44
10      32
10      61
10      95
10      63
11      4
12      93
12      66
12      50
12      7
12      48
12      58
12      33
12      71
13      36
13      6
14      68
14      96
14      94
15      91
15      5
15      70
15      2
15      98
16      75
16      28
16      78
16      16
18      60
18      23
18      83
18      64
20      13
20      12
20      35
20      87
20      34
20      15
20      11
20      1
20      8
20      51
20      43
20      20
22      86
22      47
22      14
22      10
22      88
23      18
25      24
25      49
25      97
25      31
25      84
25      92
26      73
27      65
27      42
28      85
30      27
30      38
30      54
30      37
30      41
30      22
30      77
30      76
30      72
30      29
30      25
30      69
30      55
30      59
30      52
30      30
30      19
31      80
31      9
32      82
33      46
34      45
35      81
35      57
35      56
35      53
35      17
40      74
40      26
40      40
42      90
45      21
```
Here, we writed a MapReduce job that displays the district where the oldest tree is.

## Oldest Tree

```bat
[yazoulay@hadoop-edge01 ~]$ yarn jar /home/yazoulay/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar oldest
tree.csv oldestt01
20/11/10 22:58:12 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 22:58:12 INFO hdfs.DFSClient: Created token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605045492804, maxDate=1605650292804, sequenceNumber=6225, masterKeyId=46 on ha-hdfs:efrei
20/11/10 22:58:12 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605045492804, maxDate=1605650292804, sequenceNumber=6225, masterKeyId=46)
20/11/10 22:58:13 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/yazoulay/.staging/job_1603290159664_3686
20/11/10 22:58:13 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 22:58:13 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 22:58:14 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3686
20/11/10 22:58:14 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605045492804, maxDate=1605650292804, sequenceNumber=6225, masterKeyId=46)]
20/11/10 22:58:14 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 22:58:14 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 22:58:14 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3686
20/11/10 22:58:14 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3686/
20/11/10 22:58:14 INFO mapreduce.Job: Running job: job_1603290159664_3686
20/11/10 22:58:24 INFO mapreduce.Job: Job job_1603290159664_3686 running in uber mode : false
20/11/10 22:58:24 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 22:58:34 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 22:58:39 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 22:58:39 INFO mapreduce.Job: Job job_1603290159664_3686 completed successfully
```

This output shows us that the tree defined by object id 36 is the oldest ( The date is 1772 )
```bat
[yazoulay@hadoop-edge01 ~]$ hdfs dfs -cat /user/yazoulay/oldest/part-r-00000
36       16
```
## District containing the most trees

We writed a MapReduce job that displays the district that contains the most trees.

```bat
[yazoulay@hadoop-edge01 ~]$ yarn jar /home/yazoulay/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar mosttrees tree.csv mostrees03  
20/11/11 00:41:00 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200  
20/11/11 00:41:01 INFO hdfs.DFSClient: Created token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605051660991, maxDate=1605656460991, sequenceNumber=6305, masterKeyId=46 on ha-hdfs:efrei  
20/11/11 00:41:01 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605051660991, maxDate=1605656460991, sequenceNumber=6305, masterKeyId=46)  
20/11/11 00:41:01 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/yazoulay/.staging/job_1603290159664_3736  
20/11/11 00:41:02 INFO input.FileInputFormat: Total input files to process : 1  
20/11/11 00:41:02 INFO mapreduce.JobSubmitter: number of splits:1  
20/11/11 00:41:02 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3736  
20/11/11 00:41:02 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for yazoulay: HDFS_DELEGATION_TOKEN owner=yazoulay@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605051660991, maxDate=1605656460991, sequenceNumber=6305, masterKeyId=46)]  
20/11/11 00:41:02 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml  
20/11/11 00:41:02 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190  
20/11/11 00:41:02 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3736  
20/11/11 00:41:02 INFO mapreduce.Job: The url to track the job: [https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3736/](https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3736/ "https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3736/")  
20/11/11 00:41:02 INFO mapreduce.Job: Running job: job_1603290159664_3736  
20/11/11 00:41:13 INFO mapred.ClientServiceDelegate: Application state is completed. FinalApplicationStatus=FAILED. Redirecting to job history server  
20/11/11 00:41:13 INFO mapreduce.Job: Job job_1603290159664_3736 running in uber mode : false  
20/11/11 00:41:13 INFO mapreduce.Job: map 0% reduce 0%
```
This output shows us that the district with the most trees is the 16th with 36 trees ( second column )
```bat
[yazoulay@hadoop-edge01 ~]$ hdfs dfs -cat mosttrees03 /part-r-00000 16 36
```











# GRE-casestudy-target
In our production environment, we don’t allow developers to SSH into servers without VP approval. Therefore, it is critical that our team provide tools to allow developers to debug problems using our monitoring tools.
For example, when we get an alert that a disk is getting full, you would want to know what files are using up all of the space.
Write a program in a language of your choice which will take a mount point as an argument and return a list of all the files on the mountpoint and their disk usage in bytes in json format.

# Solution:

```Programming language adopted: Java```
```Verison 1.8``` 
```IDE : Eclipse```

Files Uploaded to Repo:

1.> FolderSize.java
2.> FolderSizeTest.java

# Beginners guide
```
For Indivuduals who has not set up jdk can kindly dowload the package @ https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html
```
# Post Jdk installation
```
Set up Environment variables for java which looks something like "C:\Program Files (x86)\Common Files\Oracle\Java\javapath" for windows users
```
 

# Output:
1.> FolderSize.java
```
Enter path : 
C://MyStuff//interview
C:\MyStuff\interview\accounts.docx 19436
C:\MyStuff\interview\coverleter - Abicart.docx 13886
C:\MyStuff\interview\coverleter.docx 11746
C:\MyStuff\interview\New Text Document.txt 0
C:\MyStuff\interview\Target news.docx 13144
C:\MyStuff\interview\~$and muscle interview preparation.docx 162
C:\MyStuff\interview\~$counts.docx 162
C:\MyStuff\interview\~$ivalli.Komma.docx 162
C:\MyStuff\interview\~$ivalliKBM-cover letter.docx 162
C:\MyStuff\interview\~$ivalliKomma.docx 162
C:\MyStuff\interview\~$mpanies in cleveland.docx 162
C:\MyStuff\interview\~$plied on 28th oct 2015.docx 162
C:\MyStuff\interview\~$plied on 2nd DEC 2015.docx 162
C:\MyStuff\interview\~$plied on 5th Nov 2015.docx 162
C:\MyStuff\interview\~$plied on 6th Nov 2015.docx 162
C:\MyStuff\interview\~$sumeforUH.docx 162
C:\MyStuff\interview\~$verleter-Metropark.docx 162
C:\MyStuff\interview\~$verlettercityofcleveland.docx 162
C:\MyStuff\interview\~$verlettercommon.docx 162
C:\MyStuff\interview\~WRL0003.tmp 39615
C:\MyStuff\interview\~WRL0787.tmp 36434
C:\MyStuff\interview\~WRL3762.tmp 40358
```
2.> FolderSizeTest.java
```
C:\MyStuff\interview\accounts.docx 19436
C:\MyStuff\interview\coverleter - Abicart.docx 13886
C:\MyStuff\interview\coverleter.docx 11746
C:\MyStuff\interview\New Text Document.txt 0
C:\MyStuff\interview\Target news.docx 13144
C:\MyStuff\interview\~$and muscle interview preparation.docx 162
C:\MyStuff\interview\~$counts.docx 162
C:\MyStuff\interview\~$ivalli.Komma.docx 162
C:\MyStuff\interview\~$ivalliKBM-cover letter.docx 162
C:\MyStuff\interview\~$ivalliKomma.docx 162
C:\MyStuff\interview\~$mpanies in cleveland.docx 162
C:\MyStuff\interview\~$plied on 28th oct 2015.docx 162
C:\MyStuff\interview\~$plied on 2nd DEC 2015.docx 162
C:\MyStuff\interview\~$plied on 5th Nov 2015.docx 162
C:\MyStuff\interview\~$plied on 6th Nov 2015.docx 162
C:\MyStuff\interview\~$sumeforUH.docx 162
C:\MyStuff\interview\~$verleter-Metropark.docx 162
C:\MyStuff\interview\~$verlettercityofcleveland.docx 162
C:\MyStuff\interview\~$verlettercommon.docx 162
C:\MyStuff\interview\~WRL0003.tmp 39615
C:\MyStuff\interview\~WRL0787.tmp 36434
C:\MyStuff\interview\~WRL3762.tmp 40358
Folder Size: 176887 Bytes
C:\MyStuff\interview\accounts.docx 19436
C:\MyStuff\interview\coverleter - Abicart.docx 13886
C:\MyStuff\interview\coverleter.docx 11746
C:\MyStuff\interview\New Text Document.txt 0
C:\MyStuff\interview\Target news.docx 13144
C:\MyStuff\interview\~$and muscle interview preparation.docx 162
C:\MyStuff\interview\~$counts.docx 162
C:\MyStuff\interview\~$ivalli.Komma.docx 162
C:\MyStuff\interview\~$ivalliKBM-cover letter.docx 162
C:\MyStuff\interview\~$ivalliKomma.docx 162
C:\MyStuff\interview\~$mpanies in cleveland.docx 162
C:\MyStuff\interview\~$plied on 28th oct 2015.docx 162
C:\MyStuff\interview\~$plied on 2nd DEC 2015.docx 162
C:\MyStuff\interview\~$plied on 5th Nov 2015.docx 162
C:\MyStuff\interview\~$plied on 6th Nov 2015.docx 162
C:\MyStuff\interview\~$sumeforUH.docx 162
C:\MyStuff\interview\~$verleter-Metropark.docx 162
C:\MyStuff\interview\~$verlettercityofcleveland.docx 162
C:\MyStuff\interview\~$verlettercommon.docx 162
C:\MyStuff\interview\~WRL0003.tmp 39615
C:\MyStuff\interview\~WRL0787.tmp 36434
C:\MyStuff\interview\~WRL3762.tmp 40358
Folder Size: 176887 Bytes
Folder Size: 0 Bytes
```

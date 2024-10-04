antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'

###### FOR WINDOWS -- uncomment the following line if you use Windows:
#classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java

all:
	make grun

ccLexer.java:	cc.g4
	$(antlr4) cc.g4

ccLexer.class:	ccLexer.java
	javac -cp $(classpath) $(GENERATED)

# Make clean for Windows
wclean:
	del /f /q ccParser*
	del /f /q *.class
	del /f /q cc*.java
	del /f /q *.tokens
	del /f /q *.interp
	del /f /q .DS_Store
	rd /s /q .idea
	del /f /q *.iml
	rd /s /q out\*

# Make clean for Mac and Linux
mclean:
	rm -f ccParser*
	rm -f *.class
	rm -f cc*.java
	rm -f *.tokens
	rm -f *.interp
	rm -f .DS_Store
	rm -rf .idea/
	rm -f *.iml
	rm -rf out/*

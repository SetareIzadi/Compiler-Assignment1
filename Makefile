antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'

###### FOR WINDOWS -- uncomment the following line if you use Windows:
#classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java ccBaseVisitor.java ccVisitor.java

all: run

ccLexer.java: cc.g4
	$(antlr4) -visitor cc.g4

ccLexer.class: ccLexer.java
	javac -cp $(classpath) $(GENERATED)

grun: ccLexer.class cc.txt
	$(grun) cc circuit -gui -tokens cc.txt

main.class: ccLexer.class main.java
	javac -cp $(classpath) $(GENERATED) main.java

run: main.class
	java -cp $(classpath) main cc.txt

clean:
	rm -f $(GENERATED) *.class *.interp *.tokens

antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'

###### FOR WINDOWS -- uncomment the following line if you use Windows:
# classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java

# Default target: generate and run the parser
all: ccLexer.class

# Run the parser with TestRig
grun:
	$(grun) cc circuit -gui

# Generate parser and lexer files from cc.g4
ccLexer.java: cc.g4
	$(antlr4) -visitor cc.g4

# Compile the generated files
ccLexer.class: $(GENERATED)
	javac -cp $(classpath) $(GENERATED)

main.class: ccLexer.java main.java
	javac -cp $(classpath) $(GENERATED) main.java

# Ensure that grun is called only after proper compilation
run: all
	make grun

# Clean commands for Windows
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

# Clean commands for Mac and Linux
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
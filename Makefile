antlrjar = antlr-4.13.2-complete.jar

# For Linux and Mac
classpath = $(antlrjar):.

# For Windows, uncomment this line instead:
# classpath = $(antlrjar);.

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
GENERATED = ccLexer.java ccParser.java ccListener.java ccBaseListener.java ccBaseVisitor.java ccVisitor.java
SRCFILES = Main.java
CLASSES = $(GENERATED:.java=.class) $(SRCFILES:.java=.class)

# Main target to generate, compile, and run everything
all: run

# Generate lexer and parser using ANTLR
ccLexer.java: cc.g4
	$(antlr4) -visitor cc.g4

# Compile Java files
compile: ccLexer.java $(SRCFILES)
	javac -cp $(classpath) $(GENERATED) $(SRCFILES)

# Run the main class on specific input files
run: run-helloworld run-helloworld-withdef run-trafiklys-minimal run-trafiklys run-von-neumann

run-helloworld: compile
	java -cp $(classpath):. Main 01-hello-world.hw

run-helloworld-withdef: compile
	java -cp $(classpath):. Main 01b-hello-world-withdef.hw

run-trafiklys-minimal: compile
	java -cp $(classpath):. Main 02-trafiklys-minimal.hw

run-trafiklys: compile
	java -cp $(classpath):. Main 03-trafiklys.hw

run-von-neumann: compile
	java -cp $(classpath):. Main 04-von-Neumann.hw

# Clean generated and compiled files
clean:
	rm -f $(GENERATED) *.class cc*.interp ccLexer.tokens cc.tokens ccParser.tokens

# Run grun (TestRig) for graphical parse tree visualization
grun1: compile
	$(grun) cc start -gui -tokens 01-hello-world.hw

# Additional rules for grun visualizations as needed...

grun2: compile
	$(grun) cc start -gui -tokens 01b-hello-world-withdef.hw

grun3: compile
	$(grun) cc start -gui -tokens 02-trafiklys-minimal.hw

grun4: compile
	$(grun) cc start -gui -tokens 03-trafiklys.hw

grun5: compile
	$(grun) cc start -gui -tokens 04-von-Neumann.hw

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

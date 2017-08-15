JCC = javac
JVM = java
.SUFFIXES: .java .class
.java.class: ; $(JC) $(JFLAGS) $*.java

JFLAGS = -g

default: classes

MAIN = Game

CLASSES = \
	Game.java \
	OneGame.java

Game.class: Game.java
	$(JCC) $(JFLAGS) Game.java

OneGame.class: OneGame.java
	$(JCC) $(JFLAGS) OneGame.java

classes: $(CLASSES:.java=.class)

test: OneGame.class classes $(MAIN).class
	$(JVM) $(MAIN)

clean:
	$(RM) *.class
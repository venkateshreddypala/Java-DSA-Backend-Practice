import os

REF_FILE = "practice_sessions/reflection_response.md"
JOURNAL_FILE = "docs/pattern_journal.md"
FLASHCARDS_FILE = "flashcards/anki.txt"

if not os.path.exists(REF_FILE):
    print(f"No {REF_FILE} found. Run after pasting AI reflection.")
    exit()

with open(REF_FILE, "r") as f:
    reflection = f.read().strip()

if not reflection:
    print(f"{REF_FILE} is empty.")
    exit()

# Append to pattern_journal.md
with open(JOURNAL_FILE, "a") as f:
    f.write("\n\n" + reflection + "\n")

# Extract flashcards section (assumes 'Q:' lines in AI output)
flashcards = "\n".join([line for line in reflection.splitlines() if line.startswith("Q:") or line.startswith("A:")])
if flashcards:
    with open(FLASHCARDS_FILE, "a") as f:
        f.write("\n\n" + flashcards + "\n")

# Clear reflection_response.md
with open(REF_FILE, "w") as f:
    f.write("")

print(f"Appended reflection to {JOURNAL_FILE} and flashcards to {FLASHCARDS_FILE}.")

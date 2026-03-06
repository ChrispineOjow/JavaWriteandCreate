## 🚀 Features
- **Smart File Naming:** Automatically appends `.txt` if you forget to type it.
- **Input Validation:** Prevents empty filenames or invalid entries like `.`.
- **Modular Design:** Separate classes for File Creation and File Writing.
- **Modern Java:** Uses simplified `main` method syntax available in recent Java versions.

## 🛠️ How to Use
1. **Run the program:** Execute the `Main.java` file.
2. **Choose an Action:**
    - Type `create` to generate a new empty file.
    - Type `write` to add text to an existing or new file.
3. **Follow the Prompts:** Enter the filename (e.g., `myNotes`) and the content you wish to save.

## 📂 Project Structure
- `Main.java` - The entry point; handles user interaction and input logic.
- `CreateFile.java` - Contains logic for checking and creating files on the disk.
- `WriteFile.java` - Contains logic for saving user strings into the specified file.

## 💻 Technical Requirements
- Java 21+ (Java 25 recommended for simplified `main` syntax).
- A terminal or IDE (IntelliJ, VS Code, or Eclipse).

## 📝 Example
How to add this to your project:
1. Create a new file in your project folder named `README.md`.
2. Paste the text above into it.
3. When you push to GitHub, this will automatically appear as the front page of your repository!
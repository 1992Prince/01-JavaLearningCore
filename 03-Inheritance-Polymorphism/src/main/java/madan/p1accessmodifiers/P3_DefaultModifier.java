package madan.p1accessmodifiers;

public class P3_DefaultModifier {

    /**
     * ✅ Access Modifiers in Java — default vs public
     *
     * 🔸 default (a.k.a. package-private)
     *     ⚠️ Jab tum kuch bhi access modifier nahi likhte, wo default hota hai.
     *
     * ✔️ Access Allowed:
     *      ✅ Same class
     *      ✅ Same package (any class with class objects)
     *      ❌ Different package (subclass or non-subclass)
     *      ❌ Different package (subclass or non-subclass)
     *
     * 📌 Example Summary — default
     * | Where is the access?            | Allowed? | Why?                        |
     * | ------------------------------- | -------- | --------------------------- |
     * | Same class                      | ✅        | Always accessible           |
     * | Same package, non-subclass      | ✅        | Package-level access        |
     * | Same package, subclass          | ✅        | Still same package          |
     * | Different package, subclass     | ❌        | `default` is not inherited  |
     * | Different package, non-subclass | ❌        | Not visible outside package |
     *
     *
     *
     * 🔸 public - 🔓 Sabse open access — kahin se bhi accessible, no restriction.
     *
     * ✔️ Access Allowed:
     *      ✅ Same class
     *      ✅ Same package
     *      ✅ Subclass, any package
     *      ✅ Any class, any package
     *
     *      📌 Example Summary — public
     *      | Where is the access?     | Allowed? | Why?             |
     * | ------------------------ | -------- | ---------------- |
     * | Same class               | ✅        | Of course        |
     * | Same package, any class  | ✅        | Fully open       |
     * | Subclass, any package    | ✅        | Inherited + open |
     * | Any class in any package | ✅        | Public is public |
     *
     * 🧠 Yaad Rakhne Wali Line for public: "Public = Har jagah access allowed — bina kisi permission ke."
     *
     * 🔥 Final Master Comparison Chart (All 4 Access Modifiers)
     * | Modifier    | Same Class | Same Package | Subclass (diff pkg)  | Other Class (diff pkg) |
     * | ----------- | ---------- | ------------ | -------------------- | ---------------------- |
     * | `private`   | ✅          | ❌            | ❌                    | ❌                      |
     * | `default`   | ✅          | ✅            | ❌                    | ❌                      |
     * | `protected` | ✅          | ✅            | ✅ (only in subclass) | ❌ (outside subclass)   |
     * | `public`    | ✅          | ✅            | ✅                    | ✅                      |
     *
     * 🗣️ How to Explain Access Modifiers in Words (Verbal Explanation)
     * Java provides four main access modifiers: private, default (no modifier), protected, and public.
     * Each defines how accessible a class member (variable or method) is from other parts of the code.
     *
     * ✅ 1. Private
     * private members are accessible only within the same class.
     * They are not visible to any subclass or any other class — not even in the same package.
     * Useful for encapsulation and hiding sensitive data.
     * 🧠 “Strictly inside the class.”
     *
     * ✅ 2. Default (no keyword)
     * When no access modifier is specified, it’s default.
     * It allows access only within the same package — whether subclass or not.
     * It’s package-private access.
     * 🧠 “Visible to the package, invisible outside.”
     *
     * ✅ 3. Protected
     * protected members are accessible:
     * Within the same class
     * In the same package
     * And in subclasses even if they are in a different package
     * But protected members cannot be accessed via object reference outside the subclass.
     * 🧠 “Inheritance-based access beyond the package, but not object-based.”
     *
     * ✅ 4. Public
     * public members are accessible from anywhere — any class, any package, subclass or not.
     * It’s the most open level of access.
     * 🧠 “No restrictions — global access.”
     *
     * 🔁 Summary in 1 Line Each (For Fast Recall):
     * | Modifier    | Verbal Summary                            |
     * | ----------- | ----------------------------------------- |
     * | `private`   | Only inside same class                    |
     * | `default`   | Only within same package                  |
     * | `protected` | Package + Subclass (even outside package) |
     * | `public`    | Accessible everywhere                     |
     *
     *
     * 🔢 Access Modifiers in Increasing Order of Visibility
     * private < default < protected < public
     *
     * where private is most restrictive
     * and public is most open
     * default comes 2 because it is open only in current package
     * and protected members are visible in current + subclasses in diff package also
     */
}

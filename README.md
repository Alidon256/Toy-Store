# 🧸 Toy Store App

The **Toy Store App** is a simple yet elegant Android application built in **Java**, designed to showcase best practices in UI modularity, navigation architecture, and image rendering using local resources. It presents a playful toy catalog experience with smooth transitions and a clean layout.

## 🚀 Features

- 🧩 **Modular UI with XML Fragments**  
  Each screen (Home, Details, Cart) is built using reusable XML fragments for better structure and maintainability.

- 🧭 **Navigation Component with Nav Graph**  
  Navigation between fragments is handled using Android's Navigation Graph, enabling safe argument passing and intuitive user flow.

- 🖼️ **Hardcoded Image Assets**  
  All toy images are stored locally in the `drawable` folder, ensuring fast loading and offline access.

- 🛒 **Toy Catalog Simulation**  
  Users can browse toys, view details, and simulate adding items to a cart.

## 🛠️ Tech Stack

| Layer         | Technology         |
|---------------|--------------------|
| Language      | Java               |
| UI            | XML, Material Design |
| Navigation    | Navigation Graph, Safe Args |
| Image Loading | Local Drawable Resources |
| Architecture  | MVVM (Model-View-ViewModel) |


## 🧭 Navigation Graph

The app uses a centralized `nav_graph.xml` to define all navigation paths. Each fragment is connected via actions and arguments, enabling:

- Type-safe navigation with Safe Args
- Back stack management
- Simple transitions between catalog, detail, and cart views

## 🖼️ Image Handling

Images are stored in `res/drawable` and referenced directly in XML or Java:
## 📦 Installation

1. **Clone the repo**  
   ```bash
   git clone https://github.com/Alidon256/Toy-Store.git
**XML Example:**
```xml
<ImageView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:src="@drawable/toy_car" />

java example
ImageView imageView = findViewById(R.id.imageView);
imageView.setImageResource(R.drawable.toy_car);






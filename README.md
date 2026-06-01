# 🧠 ViewModelLiveDataDemo — ViewModel + LiveData Android Lab
---

## 🎬 Démo vidéo

[![Demo ViewModelLiveDataDemo](https://img.youtube.com/vi/MsQdFGLZbtQ/0.jpg)](https://youtu.be/MsQdFGLZbtQ?si=WR-iO27v7_DaLGhM)

▶️ **[Voir la démo sur YouTube](https://youtu.be/MsQdFGLZbtQ?si=WR-iO27v7_DaLGhM)**

---

## 📌 Objectif

Démontrer concrètement le problème de perte de données à la rotation d'écran, puis le résoudre avec **ViewModel** + **LiveData** — le cœur de l'architecture MVVM recommandée par Google.

---

## ✨ Fonctionnalités

| Fonctionnalité | Description |
|---|---|
| Compteur simple | Incrémenter, décrémenter, réinitialiser |
| Partie 1 | Version classique — bug à la rotation ❌ |
| Partie 2 | Version ViewModel + LiveData — rotation sans perte ✅ |

---

## 🗂️ Structure du projet

```
app/
├── manifests/
│   └── AndroidManifest.xml
└── java/com.example.viewmodellivedatademo/
    ├── MainActivity.java        # UI + observation du LiveData
    └── CounterViewModel.java    # Logique métier + MutableLiveData
```

---

## ⚙️ Configuration

- **Language** : Java
- **Minimum SDK** : API 24 (Android 7.0)
- **Target SDK** : API 36
- **Lifecycle version** : 2.10.0

### Dépendances ajoutées

```gradle
implementation("androidx.lifecycle:lifecycle-viewmodel:2.10.0")
implementation("androidx.lifecycle:lifecycle-livedata:2.10.0")
```

---

## 🚀 Lancer le projet

```bash
# Cloner le repo
git clone https://github.com/TON_USERNAME/ViewModelLiveDataDemo.git

# Ouvrir dans Android Studio
# File → Open → sélectionner le dossier

# Lancer sur émulateur ou téléphone
# Cliquer sur ▶️ Run
```

---

## 🧪 Tests

**Test 1 — Bug rotation (Partie 1)**
1. Incrémenter 10 fois
2. Tourner l'écran `Ctrl+F11`
3. Résultat : compteur repart à 0 ❌

**Test 2 — ViewModel (Partie 2)**
1. Incrémenter 15 fois
2. Tourner l'écran `Ctrl+F11`
3. Résultat : compteur intact ✅

---

## 📚 Concepts clés

**ViewModel** — survit à la destruction/re-création de l'Activity grâce au `ViewModelStore`. Aucun `onSaveInstanceState` nécessaire.

**LiveData** — observable lifecycle-aware. Met à jour l'UI uniquement quand l'Activity est en état `STARTED` ou `RESUMED` → zéro crash, zéro memory leak.

**MutableLiveData vs LiveData** — `MutableLiveData` est modifiable uniquement dans le ViewModel. L'Activity reçoit un `LiveData` en lecture seule → bonne pratique de sécurité.

**setValue vs postValue** — `setValue` depuis le thread principal, `postValue` depuis un thread background.

---

## 📊 Comparatif

| Critère | Sans ViewModel | Avec ViewModel |
|---|---|---|
| Survie rotation | ❌ | ✅ |
| Mise à jour UI automatique | ❌ | ✅ |
| Gestion thread sécurisée | ❌ | ✅ |
| Code propre (MVVM) | ❌ | ✅ |
| Support objets complexes | ❌ | ✅ |

---

## 👩‍💻 Auteur

FATIMAEZZAHRA ENNASSIRI

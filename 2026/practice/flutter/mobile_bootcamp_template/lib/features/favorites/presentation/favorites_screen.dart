import 'package:flutter/material.dart';

import '../../../core/extensions/context_extension.dart';

class FavoritesScreen extends StatelessWidget {
  const FavoritesScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(child: Text(context.l10n.favoritesEmpty));
  }
}

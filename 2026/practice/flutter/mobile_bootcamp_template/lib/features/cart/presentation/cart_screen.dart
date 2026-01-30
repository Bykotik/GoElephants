import 'package:flutter/material.dart';

import '../../../core/extensions/context_extension.dart';

class CartScreen extends StatelessWidget {
  const CartScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(child: Text(context.l10n.cartEmpty));
  }
}

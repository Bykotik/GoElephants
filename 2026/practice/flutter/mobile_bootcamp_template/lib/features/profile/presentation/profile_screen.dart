import 'package:flutter/material.dart';

import '../../../core/extensions/context_extension.dart';

class ProfileScreen extends StatelessWidget {
  const ProfileScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(child: Text(context.l10n.profileDemoName));
  }
}

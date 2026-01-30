import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:mobile_bootcamp_template/core/di/injection.dart';

import '../core/cubit/bottom_nav_cubit.dart';
import '../core/theme/app_theme.dart';
import '../l10n/app_localizations.dart';
import 'main_wrapper.dart';

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MultiBlocProvider(
      providers: [BlocProvider(create: (_) => getIt<BottomNavCubit>())],
      child: MaterialApp(
        title: 'FakeStore',
        localizationsDelegates: AppLocalizations.localizationsDelegates,
        supportedLocales: AppLocalizations.supportedLocales,
        debugShowCheckedModeBanner: false,
        themeMode: ThemeMode.system,
        theme: AppTheme.light,
        darkTheme: AppTheme.dark,
        home: const MainWrapper(),
      ),
    );
  }
}
